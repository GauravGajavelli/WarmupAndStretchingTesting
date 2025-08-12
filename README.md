## Performance Test: Stress Test

### Purpose
- This test is aimed at gauging the performance of the logger by recording the growth of the output of the output file and the speed at which tests execute

### Steps
- Doing runs with new comments added of varying sizes (to a different file each run), mimicking different types of file changes: 
  - 200 bytes
  - 800 bytes
  - 3000 bytes
- They are added in the order by the order of run_plan.csv

### Requirements
- The size of the logs (run.tar) should not exceed 10 MB
- The latency shouldn't be exceed the 500 ms; if it does then the logger should shut down

### Test Status: In Progress