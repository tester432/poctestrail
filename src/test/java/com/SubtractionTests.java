package com;

import org.testng.Assert;
import org.testng.annotations.Test;


class SubtractionTests {

    @Test
    void SubtractTwoNumbers() {
        Assert.assertEquals(4, 2 - 1, "Should equal 1");
    }
}