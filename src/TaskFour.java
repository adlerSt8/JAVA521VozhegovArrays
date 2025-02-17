//TODO: У вас есть одномерный массив целых чисел.
// Ваша задача - найти наименьший элемент в этом массиве с использованием цикла foreach.

public class TaskFour {
    public static void main(String[] args) {
        int[] numbers = {15, 16, 32, 11, 86, 12, 47, 98, 16, 77, 52, 86, 6, 73, 89, 64};
        int minNumber;

        if (numbers.length == 0) {
            System.out.println("Массив пустой");
            return;
        } else {
            minNumber = numbers[0];
        }

        for (int number:numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println("Минимальный элемент массива - " + minNumber);
    }
}
