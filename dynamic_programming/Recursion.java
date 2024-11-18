package dynamic_programming;

import java.util.HashMap;

public class Recursion {

    public static double factorial(int n) {
        if (n == 0 || n ==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static double factorialo(double n, HashMap<Double,Double> memo) {
        if (n == 0 || n ==1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, n*factorialo(n-1,memo) );
        return memo.get(n);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //System.out.println(factorialo(5,new HashMap<>()));
        System.out.println(factorial(10));
        System.out.println(System.currentTimeMillis() - start);
    }
}
