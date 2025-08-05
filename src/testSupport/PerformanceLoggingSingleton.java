package testSupport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;

public class PerformanceLoggingSingleton {


	static private final String filepath = "src/testSupport/";
	static private final String csvFilename = "performanceData.csv";
	static private final String finalTarFilename = "run.tar";

	private static long absoluteStartTime;
	private static long absoluteEndTime;
	
	private static long prevStartTime;
	private static long timeElapsed;
	private static long logSize;

	// Static instance of the singleton class
    private static PerformanceLoggingSingleton instance;

    public static PerformanceLoggingSingleton getInstance() {
        if (instance == null) {
            instance = new PerformanceLoggingSingleton();
        }
        return instance;
    }

    public static void absoluteStart() {
    	absoluteStartTime = System.nanoTime();
    }
    

    public static void absoluteEnd() {
    	absoluteEndTime = System.nanoTime();
    }

    public static void startStopwatch() {
    	prevStartTime = System.nanoTime();
    }

    public static void stopStopwatch() {
    	timeElapsed += System.nanoTime()-prevStartTime;	
    }
    
    public static void recordLogSize() {
    	try {
    		Path runTar = LoggingSingleton
    				.filepathResolve()
    				.resolve(finalTarFilename);
        	
			logSize = Files.size(runTar)/1024;
		} catch (IOException e) {
			logSize = -1;
		}
    }

    
    public static void writePerformanceLogs(boolean isError) {
		try {
			String outputString = 
					LoggingSingleton.getCurrentTestRunNumber()+(isError?"-error":"")+
					","+logSize+
					","+Long.toString(timeElapsed/1000000l)+
					","+Long.toString((absoluteEndTime-absoluteStartTime)/1000000l)+
					",";
			// Create file only if it doesn't exist
			File myObj = new File(filepath + csvFilename);
			myObj.createNewFile();

			try {
				FileOutputStream fos = new FileOutputStream(filepath + csvFilename, true);
				outputString += "\n";
				fos.write(outputString.getBytes());
				fos.close();
			} catch (Exception e) {
				System.err.println("Could open/write/close performanceData.csv file - Ignore this error");
			}
		} catch (IOException e) {
			System.err.println("Could not create performanceData.csv file - Ignore this error");
		}
    }
}