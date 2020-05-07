package com.Generic;

import java.util.Arrays;

public class TestMaximumMain < V extends Comparable <V> >
{
    V firstValue;
    V secondValue;
    V thirdValue;

    V[] valuesArray;

    public <V extends Comparable<V>> V findMaximumValue(V... valuesArray){
        Arrays.sort(valuesArray);
        V maximumValue= valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    private <V extends Comparable<V>> void printMaximumValue(V maximumValue)
    {
        System.out.println("Maximum Value is:"+maximumValue);

    }


}
