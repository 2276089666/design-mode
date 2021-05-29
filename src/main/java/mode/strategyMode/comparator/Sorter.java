package mode.strategyMode.comparator;

import mode.strategyMode.comparable.MyComparable;

/**
 * @Author ws
 * @Date 2021/5/29 14:43
 */
public class Sorter<T> {
    public  void bubbleSort(T[] arr,MyComparator<T> myComparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (myComparator.compare(arr[j],arr[j+1])>0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(T[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
