package com.abenezersefinew.Array.Flattner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayFlattenerApplication implements CommandLineRunner {

	private final ArrayFlattener arrayFlattener;

	public ArrayFlattenerApplication(ArrayFlattener arrayFlattener) {
		this.arrayFlattener = arrayFlattener;
	}

	@Override
	public void run(String... args) {
		int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
		int[] flattenedArray = arrayFlattener.flattenArray(inputArray);

		System.out.println("Flattened Array: ");
		for (int num : flattenedArray) {
			System.out.print(num + " ");
		}
	}
}
