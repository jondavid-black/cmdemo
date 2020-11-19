package org.devopsfordefense.cmdemo;

import java.util.List;

public class NumberAggregator {

    public NumberAggregator() {}

    public double aggregate(List<Double> nums) {
        double retVal = 0;

        for (double val : nums) {
            retVal += val;
        }

        return retVal;
    }
    
}