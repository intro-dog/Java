package main.java.homework_4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.lang.System.*;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = { 20, 82, 2, 1, 50, 8, 121 };
        printArray(arr);
        ascSort(arr);
        descSort(arr);
        sort(arr);
    }


    public static void printArray(int[] array) {
        System.out.print("base: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void ascSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int var = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = var;
                }
            }
        }
        System.out.print("asc: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void descSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    int var = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = var;
                }
            }
        }
        System.out.print("desc: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

    }

    public static void sort(int[] array) {
        int n = array.length;
        int left = 0;
        int i = 1;
        int right = n - 1;
        while ( left < right ) {

            for (i = left + 1; i <= right; i++) {
                if (array[left] < array[i]) {
                   int temp = array[left];
                    array[left] = array[i];
                    array[i] = temp;
                }
            }
            left++;

            for (i = right - 1; i >= left; i--) {
                if (array[right] < array[i]){
                    int temp = array[right];
                    array[right] = array[i];
                    array[i] = temp;
                }
            }
            right--;
            }

            System.out.print("inner: ");
            for (i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
        }
    }
}

















