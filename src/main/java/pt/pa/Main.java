package pt.pa;

import pt.pa.adts.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 1, 4, 3, 7, 4, 8, 9, 1, 4, 6, 4, 7, 6, 9, 5, 3, 6, 8, 4, 6, 9};

        Map<Integer, Integer> uniqueCount = new MapBST<>();

        for (int num : numbers) {
            if (uniqueCount.containsKey(num)) {
                int curCount = uniqueCount.get(num);
                uniqueCount.put(num, curCount + 1);
            } else {
                uniqueCount.put(num, 1);
            }
        }

        System.out.println("Count of each number: " + uniqueCount);

        System.out.print("Unique numbers: ");
        for (Integer key : uniqueCount.keys()) {
            if (uniqueCount.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();

        System.out.println("Sorted unique numbers with their counts:");
        List<Integer> sortedKeys = new ArrayList<>(uniqueCount.keys());
        for (Integer key : sortedKeys) {
            System.out.println(key + ": " + uniqueCount.get(key));
        }

        System.out.println("\nBinary Search Tree representation:");
        System.out.println(uniqueCount);
    }
}
