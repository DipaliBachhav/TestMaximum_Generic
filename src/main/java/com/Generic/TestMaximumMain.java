package com.Generic;

public class TestMaximumMain < V extends Comparable <V> >
{
    V firstValue;
    V secondValue;
    V thirdValue;


    public V findMaximumValue(V firstValue,V secondValue,V thirdValue)
    {
        V maximumValue=firstValue;
        if(secondValue.compareTo(maximumValue)>0)
        {
            maximumValue=secondValue;
        }
            if(thirdValue.compareTo(maximumValue)>0)
            {
                maximumValue=thirdValue;
            }
        return maximumValue;
    }
}
