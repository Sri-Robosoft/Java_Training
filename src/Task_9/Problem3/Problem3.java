package Task_9.Problem3;

import java.util.Arrays;

public class Problem3 {

    public static <T> void swap(T[] arr, int i, int j) {
        System.out.println(arr.getClass());
        T temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("After Swapping: " +Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        System.out.println("Before Swapping: " +Arrays.toString(arr1));
        swap(arr1, 0,2);

        String[] arr2 = {"Hi", "Hello", "Hey"};
        System.out.println("Before Swapping: " +Arrays.toString(arr2));
        swap(arr2, 2,0);
    }
}
