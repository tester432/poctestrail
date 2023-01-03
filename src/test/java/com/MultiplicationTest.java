package com;

import org.testng.Assert;
import org.testng.annotations.Test;


class MultiplicationTest {

    @Test
    void MultiplyTwoNumbers() {
        Assert.assertEquals(5, 2*2, "Should equal 4");
    }
}