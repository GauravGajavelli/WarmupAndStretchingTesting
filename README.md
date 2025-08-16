## Test Status: Passed
See error-logs.txt and testRunInfo.json in run.tar

## Factors Tested
### A: Run order / history
1. First test
2. Not first test

Outcome: Nothing should be affected
### E: Failure source pattern
1. My code failing
2. Their code failing
3. My/their failing - injection
4. My/their failing - pausing the tests
   - Should display java.lang.OutOfMemoryError: Junit5 test stopped by user
5. No failing code

Outcome: Should run normally; error-logs.txt and testRunInfo.json should be updated correctly
