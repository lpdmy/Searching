package Common;

public class Algorithm {

    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // target not found
    }

    public int binarySearch(int[] arr, int a) {
        int l = 0;
        int r = arr.length - 1;
        int i = r / 2;
        while (arr[i] != a && i != 0) {
            if (a > arr[i]) {
                l = i + 1;
                i = (r + l) / 2;
            } else if (a < arr[i]) {
                r = i - 1;
                i = (r - l) / 2;
            }
        }
        if (a == arr[i]) {
            return i;
        }
        return -1;
    }
}
