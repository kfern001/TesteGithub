import classes.Training;
import java.util.Scanner;

public class Workspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many itens will there be in your list? ");
        int n = sc.nextInt();
        int[] list = new int[n];

        for (int x = 0; x < list.length; x++) {
            System.out.print("Type number #" + (x + 1) + ": ");
            int number = sc.nextInt();
            list[x] = (number);
        }

        // This is comment

        Training classList = new Training();
        classList.setNumberList(list);

        double avg = 0.0;
        System.out.println("Number from the list: ");
        for (int x = 0; x < list.length; x++) {
            System.out.println("Number #" + (x + 1) + ": " + classList.getNumberList()[x]);
            avg += classList.getNumberList()[x];
        }

        System.out.printf("\nAverage of the values: %.2f%n", (avg / classList.getNumberList().length));

        System.out.println("Sum of the values from the list: " + avg);

        sc.close();
    }
}