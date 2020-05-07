package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    TestMaximumMain findMaximum=new TestMaximumMain();
    @Test
    public void givenMaximumNumberAtFirstPosition_shouldReturnFirstNumber()
    {
        int maximumNumber=findMaximum.findMaximumInteger(30,10,20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition()
    {
        int maximumNumber=findMaximum.findMaximumInteger(10,30,20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        int maximumNumber = findMaximum.findMaximumInteger(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }
    
}
