package com.abenezersefinew.Array.Reversor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }

        int[] flattenedArray = flattenerService.flattenArray(inputArray);
        List<Integer> reversedList = new ArrayList<>();

        for (int i = flattenedArray.length - 1; i >= 0; i--) {
            reversedList.add(flattenedArray[i]);
        }

        return reversedList.stream().mapToInt(Integer::intValue).toArray();
    }
}