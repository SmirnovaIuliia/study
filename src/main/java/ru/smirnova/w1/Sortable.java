package main.java.ru.smirnova.w1;

/**
 * Интерфейс содержит методы для сортировки массива, состоящего из целых чисел
 */
public interface Sortable {

    /**
     * Метод принимает массив целых чисел и возвращает отсортированный массив
     * @param arr неотсортированный массив
     * @return отсортированный массив
     */
    int[] sort(int[] arr);

    /**
     * Метод находит индекс минимального числа в массиве
     * @param arr массив целых чисел
     * @param start индекс, с которого необходимо начать искать минимальное целое число
     * @return индекс минимального числа в массиве
     */
    int findSmallest(int[] arr, int start);
}