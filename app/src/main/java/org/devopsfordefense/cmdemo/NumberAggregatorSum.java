package org.devopsfordefense.cmdemo;

import java.util.List;

public class NumberAggregatorSum implements NumberAggregator {

    public NumberAggregatorSum() {}

    public double aggregate(List<Double> nums) {
        double retVal = 0;

        for (double val : nums) {
            retVal += val;
        }

        return retVal;
    }
    
}