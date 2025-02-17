//TODO: предоставляется массив элементов, и ваша задача - определить,
// есть ли дубликаты (повторяющиеся элементы) в массиве.
// Если есть, выведите информацию о том, какие элементы являются дубликатами и их индексы.

public class TaskSecond {
    public static void main(String[] args) {
        int[] numbers = {15, 16, 32, 11, 86, 12, 47, 98, 16, 77, 52, 86, 77};

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (temp == numbers[j]) {
                    System.out.println("Найден дубликат числа " + temp + ", их индексы " + i + " и " + j);
                }
            }
        }
    }
}
