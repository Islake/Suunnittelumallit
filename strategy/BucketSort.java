package strategy;


public class BucketSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        int bucketRange = maxValue - minValue + 1;

        int[] bucket = new int[bucketRange];

        for (int value : array) {
            bucket[value - minValue]++;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                array[index++] = i + minValue;
                bucket[i]--;
            }
        }
    }

    private int findMaxValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private int findMinValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}