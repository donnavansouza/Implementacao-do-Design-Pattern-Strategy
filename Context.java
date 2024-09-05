public class Context {

    private Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    int[] executeSortArray(int[] array){
        return strategy.SortArray(array);
    }
}
