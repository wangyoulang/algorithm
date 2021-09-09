package com.jianzhi_offer;


/**
 * @author shkstart
 * @create 2021-08-2420:32
 */
public class Offer01 {
    public static void main(String[] args) {
        int a = 3;
        a = a & 1;
        char b = (char)(a + '0');
        System.out.println(b);
    }
    public static int divide(int a, int b) {
        if(a == 0x80000000 && b == -1){
            return 0x7FFFFFFF;
        }
        if(a > 0 && b > 0){
            return div(-a,-b);
        }
        if(a < 0 && b < 0){
            return div(a, b);
        }
        if(a < 0 && b > 0){
            return -div(a,-b);
        }
        if(a > 0 && b < 0){
            return -div(-a, b);
        }
        return 0;
    }
    static int div(int a,int b){
        int result = 0;
        while(a <= b){
            result ++;
            a -= b;
        }
        return result;
    }
}
