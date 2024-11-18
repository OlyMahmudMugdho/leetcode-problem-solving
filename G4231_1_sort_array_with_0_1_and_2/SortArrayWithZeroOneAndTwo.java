package G4231_1_sort_array_with_0_1_and_2;

/*
* Link :
*   https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
* */

import java.util.*;

public class SortArrayWithZeroOneAndTwo {
    public static void sort012(int[] arr, int n)
    {
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for (int num : arr) {
            if (num == 0) {
                zeros.add(num);
            }
        }

        for (int num : arr) {
            if (num == 1) {
                ones.add(num);
            }
        }

        for (int num : arr) {
            if (num == 2) {
                twos.add(num);
            }
        }
        int size = 0;

        if (size <= arr.length) {
            for (int zero : zeros) {
                queue.add(zero);
                size++;
            }
        }

        if (size <= arr.length) {
            for (int one : ones) {
                queue.add(one);
                size++;
            }
        }

        if (size <= arr.length) {
            for (int two : twos) {
                queue.add(two);
                size++;
            }
        }



        int count = 0;

        for (int i = 0; i < n; i++) {
            if(count == arr.length) {
                return;
            }
            System.out.print(queue.remove() + " ");
            count++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,2,0};
        sort012(nums,5);
    }
}
