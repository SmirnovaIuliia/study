package main.java.ru.smirnova.w1;

/**
 * Класс SortableArray принимает массив целых чисел и
 * возвращает массив, отсортированный в порядке возрастания
 */
public class SortableArray implements Sortable {

    public int[] a;

    public SortableArray(int[] a) {
        this.a = a;
    }

    /**
     * Метод принимает массив целых чисел и возвращает отсортированный массив
     * @param arr неотсортированный массив
     * @return отсортированный массив
     */
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int smallestIndex = findSmallest(arr, i);

            int tmp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = tmp;
        }
        return arr;
    }

    /**
     * Метод находит индекс минимального числа в массиве
     * @param arr массив целых чисел
     * @param start индекс, с которого необходимо начать искать минимальное целое число
     * @return индекс минимального числа в массиве
     */
    public int findSmallest(int[] arr, int start){
        int smallest = arr[start];
        int smallestIndex = start;
        for (int i = start + 1; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
