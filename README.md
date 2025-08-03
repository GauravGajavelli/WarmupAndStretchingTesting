## Test Status: Passed
See testRunInfo.json, diffs.tar, and error-logs.txt in run.tar

## Factors Tested
### C: File edit patterns
Edit pattern per file
1. Set run.tar’s size to 10 MB
2. Attempt to run to establish baseline
3. Delete file contents
4. Run with no edits
5. Run with single file edit
6. Run with multiple edits
  - Including the single file
7. Run with no edits
8. Run with two separate files edited to become >5 MB
9. Delete comments
10. Run with no edits
Outcome: Correct diffs.tar file counts and testRunInfo.json in run.tar; error-logs.txt should be empty
### E: Failure source pattern
1. My code failing
2. My/their failing - injection
3. Their code failing
4. No failing code
Outcome: Should run normally; error-logs.txt and testRunInfo.json should be updated correctly

NOTE: These tests are overlapped by rerunning each step of E for each run of C, totaling 28