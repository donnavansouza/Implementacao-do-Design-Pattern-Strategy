import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        int[] array = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Informe um número: ");
            int num = scanner.nextInt();
            array[i] = num;
        }

        System.out.println("Escolha um algoritmo de ordenação:");
        System.out.println("1 - Selection Sort");
        System.out.println("2 - Bubble Sort");
        System.out.println("3 - Insertion Sort");

        System.out.print("Digite sua escolha: ");
        int escolha = scanner.nextInt();


        switch (escolha){
            case 1:
                context.setStrategy(new SelectionSort());
                System.out.println(Arrays.toString(context.executeSortArray(array)));
                break;
            case 2:
                context.setStrategy(new BubbleSort());
                System.out.println(Arrays.toString(context.executeSortArray(array)));
                break;
            case 3:
                context.setStrategy(new InsertionSort());
                System.out.println(Arrays.toString(context.executeSortArray(array)));
                break;
            default:
                System.out.println("Escolha inválida");
        }
    }
}