## Test Status: Passed
See testRunInfo.json, diffs.tar, and error-logs.txt in run.tar

## Factors Tested
### C: File edit patterns
Edit pattern per file
1. Set run.tar’s size to 10 MB
2. Attempt to run to establish baseline
3. Delete file contents
4. Run with no edits
5. Run with a file edited to become >3 MB
6. Run with multiple edits
7. Run with no edits
8. Run with two separate files edited to become >5 MB
9. Delete comments from two files
10. Run with no edits
Outcome: Correct diffs.tar file counts and testRunInfo.json in run.tar; error-logs.txt should be empty

### D: File churn type
File churn type
1. Add a large (between 1 and 3 MB) file
  - LargeClass1.java
2. Large (between 1 and 3 MB) new file added and small file
  - LargeClass2.java
3. Different file deleted and small file edited
4. Large files and new small file deleted
Outcome: Correct diffs.tar file counts and testRunInfo.json in run.tar; error-logs.txt should be empty

NOTE: These tests are overlapped by rerunning each step of D for the runs in Steps 4-10 of C, totaling 24, with 6 empty additional classes (SampleClass1-6) for deletion