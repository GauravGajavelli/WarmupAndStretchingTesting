## Test Status: Passed
See testRunInfo.json, diffs.tar, and error-logs.txt in run.tar

## Factors Tested
### D: File churn type
File churn type
1. Add a large (between 1 and 3 MB) file
  - LargeClass1.java
2. Large (between 1 and 3 MB) new file added and small file
  - LargeClass2.java
3. Different file deleted and small file edited
4. Large files and new small file deleted
Outcome: Correct diffs.tar file counts and testRunInfo.json in run.tar; error-logs.txt should be empty
### E: Failure source pattern
1. My code failing
2. My/their failing - injection
3. Their code failing
4. No failing code
Outcome: Should run normally; error-logs.txt and testRunInfo.json should be updated correctly


NOTE: These tests are overlapped by rerunning each step of E for step of D, totaling 16
- To compensate, an extra unused class file is added (SampleClass1) for deletion