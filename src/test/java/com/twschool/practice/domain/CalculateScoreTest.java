package com.twschool.practice.domain;

import com.twschool.practice.domain.CalculateScore;
import com.twschool.practice.domain.GameAnswer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CalculateScoreTest {
    int userTotalScores;
    @Test
    public void should_return_3_when_success_1times_and_fail_0times() {
        CalculateScore calculateScore = new CalculateScore(0,1);

        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();

        Assert.assertEquals(3, userTotalScores);
    }


}
