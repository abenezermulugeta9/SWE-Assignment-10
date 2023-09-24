package com.abenezersefinew.Array.Flattner;

import org.springframework.stereotype.Component;

@Component
public class ArrayFlattener {

    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }

        int totalLength = 0;
        for (int[] arr : inputArray) {
            totalLength += arr.length;
        }

        int[] flattenedArray = new int[totalLength];
        int currentIndex = 0;

        for (int[] arr : inputArray) {
            for (int num : arr) {
                flattenedArray[currentIndex] = num;
                currentIndex++;
            }
        }

        return flattenedArray;
    }
}
