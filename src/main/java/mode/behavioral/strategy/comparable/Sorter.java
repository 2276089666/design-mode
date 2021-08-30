package mode.behavioral.strategy.comparable;

/**
 * @Author ws
 * @Date 2021/5/29 14:43
 */
public class Sorter {
    public static void bubbleSort(MyComparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1])>0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(MyComparable[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        MyComparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
