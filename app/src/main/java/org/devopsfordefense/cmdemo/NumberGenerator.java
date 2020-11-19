package org.devopsfordefense.cmdemo;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.math3.distribution.NormalDistribution;

public class NumberGenerator {

    private NormalDistribution norm = null;

    public NumberGenerator() {
        norm = new NormalDistribution(50.0, 2.0);
    }

    public List<Double> generate() {

        List<Double> retVal = new LinkedList<Double>();

        for (int i = 0; i<100; i++) {
            retVal.add(norm.sample());
        }

        return retVal;
    } 
    
}

