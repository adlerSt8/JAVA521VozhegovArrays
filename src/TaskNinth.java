//TODO: Предоставлен массив элементов и число, представляющее количество шагов для циклической ротации.
// Ваша задача - выполнить ротацию массива вправо на заданное количество шагов.

import java.util.Arrays;
import java.util.Scanner;

public class TaskNinth {
    public static void main(String[] args) {
        int[] numbers = {15, 16, 32, 11, 86, 12, 47, 98, 16, 77, 52, 86, 77};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество шагов: ");
        int numberOfSteps = scanner.nextInt();
        scanner.close();

        int n = numbers.length;
        numberOfSteps = numberOfSteps % n; //Если шаги выходят за пределы массива,
                                           // то сдвиг начинается с нулевого индекса

        int[] temp = new int[n]; // Временный массив для хранения элементов с новыми позициями

        //Перемещение элементов на новое место
        for (int i = 0; i < n; i++) {
            int position = (i + numberOfSteps) % n;
            temp[position] = numbers[i];
        }

        //Копируем элементы с новыми позициями из временного массива
        for (int i = 0; i < n; i++) {
            numbers[i] = temp[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
