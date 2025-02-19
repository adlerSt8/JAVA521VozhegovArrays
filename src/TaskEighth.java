import java.util.Arrays;
//TODO: Предоставлен массив элементов, включая возможные дубликаты.
// Ваша задача - создать новый массив, который не содержит повторяющихся элементов.

public class TaskEighth {
    public static void main(String[] args) {
        int[] numbers = {7, 6, 5, 7, 4, 3, 2, 2, 1};
        int count = 0;

        //Сортировка массива
        Arrays.sort(numbers);

        // Подсчитываем количество дубликатов
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            }
        }
        //Создаем новый массив для уникальных элементов
        int[] numberUnique = new int[numbers.length - count];


        int index = 1;
        numberUnique[0] = numbers[0]; //Записываем первый элемент в новый массив, так как он всегда уникальный
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] != numbers[i - 1]) {
                numberUnique[index++] = numbers[i];
            }
        }

        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        System.out.println("Массив с уникальными элементами: " + Arrays.toString(numberUnique));
    }
}
