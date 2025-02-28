import java.util.Arrays;
import java.util.Scanner;

public class ExercicioIBM {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(randomNumbers);

        System.out.println("Array: "+ Arrays.toString(randomNumbers));
        
        System.out.println("Média: " + average(randomNumbers));

        System.out.printf("Maior: %d; Menor: %d", randomNumbers[randomNumbers.length - 1], randomNumbers[0]);

    }
    public static double average(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return (double) soma / array.length;
    }
}