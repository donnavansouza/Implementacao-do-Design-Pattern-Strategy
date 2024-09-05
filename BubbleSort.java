public class BubbleSort implements Strategy {

    @Override
    public int[] SortArray(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 1; x < (n - i); x++) {
                if (array[x - 1] > array[x]) {
                    temp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = temp;
                }

            }
        }
        return array;
    }
}

