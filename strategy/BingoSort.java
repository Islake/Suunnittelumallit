package strategy;

class BingoSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        int max = getMax(array);
        int nextMax = max;
        int nextMaxIndex = 0;

        while (nextMaxIndex < n) {
            int currentMax = nextMax;
            nextMax = Integer.MIN_VALUE;

            for (int i = nextMaxIndex; i < n; i++) {
                if (array[i] == currentMax) {
                    swap(array, i, nextMaxIndex);
                    nextMaxIndex++;
                } else if (array[i] > nextMax) {
                    nextMax = array[i];
                }
            }
        }
    }

    private int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}