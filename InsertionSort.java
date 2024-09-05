public class InsertionSort implements Strategy{

    @Override
    public int[] SortArray(int[] array) {
            for (int j = 1; j < array.length; j++) {
                int key = array[j];
                int i = j - 1;
                while (i >= 0 && array[i] > key) {
                    array[i+1] = array[i];
                    i -= 1;
                }
                array[i+1] = key;
            }
            return array;
    }
}

