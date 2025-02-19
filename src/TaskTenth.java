//TODO: Предоставлен массив чисел.
// Ваша задача - найти подмассив (последовательность элементов) с наибольшей суммой элементов

public class TaskTenth {
    public static void main(String[] args) {

        int[] numbers = {4, -2, 6, -10, 8, 1};
        int sum = 0;
        int sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum > sumMax) {
                sumMax = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Максимальная суммма подмассива: " + sumMax);
    }
}
