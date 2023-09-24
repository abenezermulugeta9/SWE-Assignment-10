package com.abenezersefinew.Array.Reversor;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayReversorTest {
    private ArrayReversor arrayReversor;

    @Before
    public void setUp() {
        ArrayFlattenerService flattenerService = new ArrayFlattenerService();
        arrayReversor = new ArrayReversor(flattenerService);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 91}};
        int[] expectedOutput = {91, 5, 4, 0, 3, 1};
        int[] result = arrayReversor.reverseArray(inputArray);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] inputArray = null;
        int[] result = arrayReversor.reverseArray(inputArray);

        assertNull(result);
    }
}