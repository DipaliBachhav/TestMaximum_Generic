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
}
