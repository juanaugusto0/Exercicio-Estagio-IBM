import java.util.Arrays;

public class ExercicioIBM {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 201) - 100;
        }
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