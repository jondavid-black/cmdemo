package org.devopsfordefense.cmdemo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class NumberGeneratorTest {
    @Test void numbersAreGenerated() {
        NumberGenerator ng = new NumberGenerator();
        List<Double> nums = ng.generate();
        assertNotNull(nums, "NumGen should not return null");
        assertTrue(nums.size() >= 1000, "NumGen should return at least 1000 values in the number list");
    }
}
