public class Main {
    public static void main(String[] args) {

        // --- Задание 1: Найти min/max и среднее в int[] ---
        // Используем индексный цикл, так как нужно пройти по всем элементам массива
        System.out.println("--- Задание 1 ---");
        int[] arr = {5, 2, 9, 1, 7};
        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("Min: " + min + ", Max: " + max + ", Avg: " + avg);

        // --- Задание 2: Для int[][] посчитать сумму каждой строки и каждого столбца ---
        System.out.println("\n--- Задание 2 ---");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Сумма по строкам
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Сумма строки " + i + ": " + rowSum);
        }

        // Сумма по столбцам
        if (matrix.length > 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                int colSum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Сумма столбца " + j + ": " + colSum);
            }
        }

        // --- Задание 3: Разбить CSV-подобную строку через split ---
        // Используем String, так как исходная строка неизменна
        System.out.println("\n--- Задание 3 ---");
        String csv = "Иванов,Иван,25,Разработчик";
        String[] fields = csv.split(",");
        for (int i = 0; i < fields.length; i++) {
            System.out.println("Поле " + (i + 1) + ": " + fields[i]);
        }

        // --- Задание 4: Подсчитать слова, удовлетворяющие условию (длина > 4) ---
        System.out.println("\n--- Задание 4 ---");
        String text = "Java is an object oriented programming language";
        String[] words = text.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                count++;
            }
        }
        System.out.println("Слов длиннее 4 символов: " + count);

        // --- Задание 5: Собрать отчёт через StringBuilder ---
        // Используем StringBuilder, чтобы избежать создания лишних объектов в памяти при склеивании
        System.out.println("\n--- Задание 5 ---");
        String[] reportItems = {"Ошибка компиляции", "Утечка памяти", "NullPointerException"};
        StringBuilder report = new StringBuilder();
        report.append("Еженедельный отчет по багам:\n");
        for (int i = 0; i < reportItems.length; i++) {
            report.append(i + 1).append(". ").append(reportItems[i]).append("\n");
        }
        System.out.print(report.toString());

        // --- Задание 6: Обработать таблицу без List/Map ---
        // Используем параллельные массивы и индексный цикл для имитации таблицы
        System.out.println("\n--- Задание 6 ---");
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] salaries = {1000, 1200, 1500};
        int targetSalary = 1200;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] >= targetSalary) {
                System.out.println(names[i] + " получает " + salaries[i]);
            }
        }
    }
}
