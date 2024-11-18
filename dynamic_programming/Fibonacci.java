package dynamic_programming;


import java.util.HashMap;
import java.util.Set;

public class Fibonacci {
    public static double fib(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }

    public static double fibo(double n, HashMap<Double,Double> memo) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }

        else memo.put(n,    fibo(n-1,memo) + fibo(n-2,memo)   );
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fibo(80, new HashMap<>()));
    }
}


// 1 1 2 3 5 8 13 21