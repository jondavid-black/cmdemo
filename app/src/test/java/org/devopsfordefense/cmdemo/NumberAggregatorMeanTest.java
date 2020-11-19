package org.devopsfordefense.cmdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class NumberAggregatorMeanTest {
    @Test void numbersAreAggregatedAsMean() {
       
        NumberAggregatorMean na = new NumberAggregatorMean();

        List<Double> nums = new ArrayList<>();
        double sum = 0.0;
        for (int i=0; i<10; i++) {
            double val = i * 3.14159;
            nums.add(val);
            sum += val;
        }

        double result =  na.aggregate(nums);
        assertEquals(sum/10.0, result, "Aggregation did not return mean of input values");
    }
}