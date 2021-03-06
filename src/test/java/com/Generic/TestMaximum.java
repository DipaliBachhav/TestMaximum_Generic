package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    TestMaximumMain findMaximum=new TestMaximumMain();
    @Test
    public void givenMaximumNumberAtFirstPosition_shouldReturnFirstNumber()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(30, 10, 20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaximumIntegerAtSecondPosition_shouldReturnSecondPosition()    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 30, 20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaximumIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(30.5, 20.5, 10.5);
        Assert.assertEquals(30.5, maximumFloat);
    }

    @Test
    public void givenMaximumFloatAtSecondPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 30.5, 20.5);
        Assert.assertEquals(30.5, maximumFloat);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maximumFloat);
    }

    @Test
    public void givenMaximumStringAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("peach", "apple", "banana");
        Assert.assertEquals("peach",maximumString);
    }

    @Test
    public void givenMaximumStringAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","peach","banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test

    public void givenMaximumStringAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","banana","peach");
        Assert.assertEquals("peach",maximumString);
    }

    @Test
    public void givenMoreThanThreeInteger_whenMaximum_shouldReturnMaximumInteger()
    {
        Comparable maximumValue=findMaximum.findMaximumValue(10,20,30,40,50,60);
        Assert.assertEquals(60,maximumValue);
    }
    //TC:4.2
    @Test
    public void givenMoreThanThreeFloatNumber_whenMaximum_shouldReturnMaximumFloatNumber()
    {
        Comparable maximumValue=findMaximum.findMaximumValue(5.5,3.5,1.2,7.4,4.2);
        Assert.assertEquals(7.4,maximumValue);
    }
    //TC:4.3
    @Test
    public void givenMoreThanThreeString_whenMaximum_shouldReturnMaximumString()
    {
        Comparable maximumValue=findMaximum.findMaximumValue("apple", "banana", "peach", "strawberry", "mango");
        Assert.assertEquals("strawberry",maximumValue);
    }

}


