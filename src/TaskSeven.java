//TODO: У вас есть массив строк, и ваша задача - найти самую длинную строку в этом массиве.

public class TaskSeven {
    public static void main(String[] args) {
        String[] words = {
                "Привет",
                "мир",
                "Java",
                "программирование",
                "коллекции",
                "массивы",
                "функции",
                "циклы",
                "условия",
                "методы"
        };

        String string = words[0];

        for (String word: words) {
            if (word.length() > string.length()) {
                string = word;
            }
        }
        System.out.println("Самая большая строка в массиве: " + string);
    }
}
