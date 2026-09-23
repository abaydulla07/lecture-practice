public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        // Используем индексный цикл (fori), так как нам нужно пройти по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        double avg = sum / arr.length;
        System.out.println("Min: " + min + ", Max: " + max + ", Avg: " + avg);
    }
}
