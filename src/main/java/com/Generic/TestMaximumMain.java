package com.Generic;

public class TestMaximumMain < V extends Comparable <V> >
{
    V firstValue;
    V secondValue;
    V thirdValue;

    public TestMaximumMain()
    {
    }

    public TestMaximumMain(V firstValue,V secondValue,V thirdValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

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

    public <V extends Comparable<V>> V findMaximumValue()
    {
        return (V) findMaximumValue(firstValue,secondValue,thirdValue);
    }

}
