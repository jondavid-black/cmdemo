package org.devopsfordefense.cmdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class NumberAggregatorSumTest {
    @Test void numbersAreAggregatedAsSum() {
       
        NumberAggregatorSum na = new NumberAggregatorSum();

        List<Double> nums = new ArrayList<>();
        double sum = 0.0;
        for (int i=0; i<10; i++) {
            double val = i * 3.14159;
            nums.add(val);
            sum += val;
        }

        double result =  na.aggregate(nums);
        assertEquals(sum, result, "Aggregation did not return sum of input values");
    }
}