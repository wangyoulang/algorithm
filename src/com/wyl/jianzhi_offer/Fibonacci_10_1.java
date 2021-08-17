package com.wyl.jianzhi_offer;

public class Fibonacci_10_1 {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;
        int result = 0;
        while(--n > 0){
            result = first + second;
            result %= 1000000007;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(701408733 % 1000000007);
        System.out.println(new Fibonacci_10_1().fib(44));
    }
}
