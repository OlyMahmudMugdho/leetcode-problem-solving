package G2614_1_cyclically_rotate_array_by_1;


/*
* link : https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
* */

public class Rotate {
    public static void rotate(int[] arr, int n)
    {   int[] newArray = new int[arr.length];
        int lastElement = arr[arr.length - 1];
        newArray[0] = lastElement;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = arr[i-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr,5);
    }
}
