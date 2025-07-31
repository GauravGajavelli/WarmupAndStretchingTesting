## Test Status: Passed
See testRunInfo.json, diffs.tar, and error-logs.txt in run.tar

## Factors Tested
### B: Test volume pattern
1. Single test
2. Single file multiple test
3. Multiple files
Outcome: testRunInfo reflects pattern
### E: Failure source pattern
1. My code failing
2. Their code failing
3. My/their failing - injection
4. No failing code
Outcome: Should run normally; error-logs.txt (6 messages) and testRunInfo.json should be updated correctly (6 runs)

NOTE: These tests are overlapped by rerunning each step of B for each run, totaling 12