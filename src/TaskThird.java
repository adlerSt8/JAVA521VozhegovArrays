//TODO: Предоставлен массив чисел и значение, которое нужно найти.
// Ваша задача - определить, содержит ли массив заданное значение, и
// если да, то найти индекс этого значения в массиве.

import java.util.Random;
import java.util.Scanner;

public class TaskThird {
    public static void main(String[] args) {
        int[] numbers = {15, 16, 32, 11, 86, 12, 47, 98, 16, 77, 52, 86, 77, 73, 89, 64};
        Scanner scanner = new Scanner(System.in);
        boolean isNumberArray = false;
        String indexes = "";

        System.out.println("Введите число, которое нужно найти: ");
        int number = scanner.nextInt();

        int i = 0;
        while (i < numbers.length) {
            if (number == numbers[i]) {     // Сравниваем
                isNumberArray = true;
                indexes += i + ", ";
            }
            i++;
        }
        System.out.println((isNumberArray)
                ? "Число " + number + " в массиве найдено. Его индекс(ы) - " + indexes
                : "Число в массиве не найдено.");
    }
}
