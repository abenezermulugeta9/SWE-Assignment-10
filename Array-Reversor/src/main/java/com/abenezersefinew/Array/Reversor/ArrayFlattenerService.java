package com.abenezersefinew.Array.Reversor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class ArrayFlattenerService {
    public int[] flattenArray(int[][] inputArray) {
        List<Integer> flattenedList = new ArrayList<>();

        for (int[] subArray : inputArray) {
            for (int element : subArray) {
                flattenedList.add(element);
            }
        }

        return flattenedList.stream().mapToInt(Integer::intValue).toArray();
    }
}