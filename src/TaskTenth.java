//TODO: Предоставлен массив чисел.
// Ваша задача - найти подмассив (последовательность элементов) с наибольшей суммой элементов

public class TaskTenth {
    public static void main(String[] args) {

        int[] numbers = {-4, -2, -6, -10, -8, -1, -15, -7, -8, -24, -12, -6, -20};
        int sum = 0;
        int sumMax = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum > sumMax) {
                sumMax = sum;
                startIndex = temp;
                endIndex = i;
            }
            if (sum < 0) {
                sum = 0;
                temp = i + 1;
            }
        }
        System.out.println("Максимальная суммма подмассива: " + sumMax);
        System.out.println("Вывод подмассива: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
