//TODO: У вас есть двумерный массив чисел, например, матрица.
// Ваша задача - написать программу, которая находит сумму всех элементов в этом массиве.

public class TaskFifth {
    public static void main(String[] args) {
        int[][] numbers = {{6, 67, 12}, {15, 7, 53}, {31, 22, 7}};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
