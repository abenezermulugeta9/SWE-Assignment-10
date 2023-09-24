package com.abenezersefinew.Array.Flattner;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {

    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
        Assert.assertArrayEquals(expectedOutput, flattenedArray);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
        Assert.assertNull(flattenedArray);
    }
}