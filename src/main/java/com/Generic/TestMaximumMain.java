package com.Generic;

public class TestMaximumMain {
    public  int findMaximumInteger(int firstNumber,int secondNumber,int thirdNumber)
    {
        int maximumNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber)
        {
            return maximumNumber=firstNumber;
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber)
        {
            return maximumNumber=secondNumber;
        }
        else
        {
            return maximumNumber=thirdNumber;
        }
    }

    public float findMaximumFloat( float firstNumber,float secondNumber,float thirdNumber)
    {
        float maximumNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber)
        {
            return maximumNumber=firstNumber;
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber)
        {
            return maximumNumber=secondNumber;
        }
        else
        {
            return maximumNumber=thirdNumber;
        }
    }

    public String findMaximumString(String string1,String string2,String string3)
    {
        String maximumString=string1;
        if(string2.compareTo(maximumString)>0)
        {
            maximumString=string2;
        }
        if(string3.compareTo(maximumString)>0)
        {
            maximumString=string3;
        }
        return maximumString;
    }
}
