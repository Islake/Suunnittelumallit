package strategy;

import java.util.Random;

public class SortingPerformanceTest {
    public static void main(String[] args) {
        int[] smallDataSet = generateRandomArray(30);
        int[] largeDataSet = generateRandomArray(100000);

        Sorter sorter = new Sorter();

        // Bubble Sort
        sorter.setStrategy(new BubbleSort());
        measurePerformance(sorter, smallDataSet.clone(), "Bubble Sort (Small Data Set)");
        measurePerformance(sorter, largeDataSet.clone(), "Bubble Sort (Large Data Set)");

        // Bucket Sort
        sorter.setStrategy(new BucketSort());
        measurePerformance(sorter, smallDataSet.clone(), "Bucket Sort (Small Data Set)");
        measurePerformance(sorter, largeDataSet.clone(), "Bucket Sort (Large Data Set)");

        // Bingo Sort
        sorter.setStrategy(new BingoSort());
        measurePerformance(sorter, smallDataSet.clone(), "Bingo Sort (Small Data Set)");
        measurePerformance(sorter, largeDataSet.clone(), "Bingo Sort (Large Data Set)");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    private static void measurePerformance(Sorter sorter, int[] array, String description) {
        long startTime = System.nanoTime();
        sorter.sort(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println(description + ": " + duration + " ms");
    }
}