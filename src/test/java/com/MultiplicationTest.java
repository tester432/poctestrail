package com;

import org.testng.Assert;
import org.testng.annotations.Test;


class MultiplicationTest {

    @Test
    void MultiplyTwoNumbers() {
        Assert.assertEquals(4, 2*2, "Should equal 4");
    }
    @Test
    void ScenarioVerifyAccountspage() {
        Assert.assertEquals(4, 2*2, "Should equal 4");
    }
}