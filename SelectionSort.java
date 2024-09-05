public class SelectionSort implements Strategy{

    @Override
    public int[] SortArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int index = i;
            int min = array[i];
            for (int j = i+1; j < n; j++)
            {
                if (array[j] < array[index])
                {
                    index = j;
                    min = array[j];
                }
            }
            int t = array[index];
            array[index] = array[i];
            array[i] = t;
        }
        return array;
    }
}