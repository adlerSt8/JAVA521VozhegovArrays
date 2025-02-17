//TODO: У вас есть трехмерный массив чисел, представляющий собой набор матриц.
// Ваша задача - вычислить среднее значение всех элементов в этом трехмерном массиве.

public class TaskSixth {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                    {124, 54, 2, 6, 8},
                    {12, 5, 87, 41, 5},
                    {24, 16, 25, 12, 98}
                },
        };

        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int n = 0; n < numbers[i][j].length; n++) {
                    sum += numbers[i][j][n];
                    count++;
                }
            }
        }


        double average= (double) sum / count;

        System.out.println("Среднее значение всех элементов массива = " + average);
    }
}
