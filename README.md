## Test Status: Passed
See testRunInfo.json, diffs.tar, and error-logs.txt in run.tar

## Factors Tested
### B: Test volume pattern
1. Single test
2. Single file multiple test (one then many)
3. Multiple files
4. One test (many then one)

Outcome: testRunInfo reflects pattern
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
9. Run with no edits

Outcome: Correct diffs.tar file counts and testRunInfo.json in run.tar; error-logs.txt should be empty

NOTE: These tests are overlapped by rerunning each step of B for each run, totaling 28
