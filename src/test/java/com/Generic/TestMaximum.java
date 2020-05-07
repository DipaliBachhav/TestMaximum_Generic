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
    public void givenMaximumIntegerAtSecondPosition_shouldReturnSecondPosition()    {
        int maximumNumber=findMaximum.findMaximumInteger(10,30,20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaximumIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        int maximumNumber = findMaximum.findMaximumInteger(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        float maximumFloat = findMaximum.findMaximumFloat(30.5f,20.5f,10.5f);
        Assert.assertEquals(30.5f, maximumFloat,0.1);
    }

    @Test
    public void givenMaximumFloatAtSecondPosition_shouldReturnFirstPosition() {
        float maxFloat = findMaximum.findMaximumFloat(10.5f,30.5f,20.5f);
        Assert.assertEquals(30.5f, maxFloat,0.1);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnFirstPosition() {
        float maxFloat = findMaximum.findMaximumFloat(10.5f, 20.5f, 30.5f);
        Assert.assertEquals(30.5f, maxFloat,0.1);
    }
}
