package G1813_1_MoveNegativesToEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveNegativesToEnd {
    public static void segregateElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (a >= 0) {
                list.add(a);
            }
        }

        for (int a : arr) {
            if (a < 0) {
                list.add(a);
            }
        }
        for (int i=0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(nums);
    }
}
