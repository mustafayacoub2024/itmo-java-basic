package lab4.Part2;

import java.util.Arrays;

public class Task5 {


    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void printArray(int[] array) {
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 2};
        int[] array2 = {2, 5, 1, 0, 10, 9, 4, 2, 8, 6, 7};
        printArray(array);
        printArray(array2);
    }
}
