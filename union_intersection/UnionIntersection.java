package union_intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
* link : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
* */
public class UnionIntersection {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
                result.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
                result.add(b[i]);
        }

        return result.size();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
        System.out.println(doUnion(a,5,b,3));
    }
}
