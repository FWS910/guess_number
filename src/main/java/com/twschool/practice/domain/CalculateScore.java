package com.twschool.practice.domain;

public class CalculateScore {

    private int failTimes;
    private int successTimes;

    public CalculateScore(int failTimes, int successTimes) {
        this.failTimes = failTimes;
        this.successTimes = successTimes;
    }

    public int getFailTimes() {
        return failTimes;
    }

    public void setFailTimes(int failTimes) {
        this.failTimes = failTimes;
    }

    public int getSuccessTimes() {
        return successTimes;
    }

    public void setSuccessTimes(int successTimes) {
        this.successTimes = successTimes;
    }

    public int calculateExtra() {
        int userTotalScoreExtra = 0;
        if (successTimes >= 3) {
            userTotalScoreExtra += successTimes/3 * 2;
        }
        if (successTimes >= 5 ) {
            userTotalScoreExtra +=  successTimes/5 * 3;
        }
        return userTotalScoreExtra;
    }
    public int calculate() {
        int userTotalScore = 0;
        userTotalScore = 3 * (successTimes - failTimes);
        return userTotalScore;
    }

}
