import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TODO: Программа, которая переворачивает массив, так чтобы последний элемент стал первым,
// предпоследний - вторым и так далее.
// Используйте Random для заполнения массива. Вывести свои было и стало.

public class TaskFirst {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lengthArray = scanner.nextInt();

        int[] numbers = new int[lengthArray];
        int[] numbersSort = new int[lengthArray];
        Random random = new Random();

        //Заполянем массив случайными числами от 0 до 199
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = random.nextInt(200);
        }

        //Переворачиваем массив
        for (int i = 0; i < lengthArray; i++) {
            numbersSort[i] = numbers[lengthArray - 1 - i];
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Перевернутый массив: " + Arrays.toString(numbersSort));

        scanner.close();
    }
}
