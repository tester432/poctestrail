package com;

import org.testng.Assert;
import org.testng.annotations.Test;

class SumTests {

    @Test
    void AddTwoNumbers() {
        Assert.assertEquals(6, 1 + 2, "1 + 2 should equal 3");
    }

    @Test
    void AddTwoNumbersWithDecimals() {
        Assert.assertEquals(5, 1.5+1.5, "1.5+1.4 should equal 3");
    }
}
