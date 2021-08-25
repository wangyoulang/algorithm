package com.wyl.jianzhi_offer;


/**
 * @author shkstart
 * @create 2021-08-2422:24
 */
public class Offer02 {
    public static void main(String[] args) {
        String a = "1010",b = "1011";
        System.out.println(addBinary(a,b));
    }
    private static int f = 0;
    public static String addBinary(String a, String b) {
        int n = a.length(),m = b.length();
        int len = Math.max(n,m);
        a = revert(a.toCharArray());
        b = revert(b.toCharArray());
        StringBuffer s = new StringBuffer();
        int  p = 0;
        while(p < len){
            char _a = '0',_b = '0';
            if(n > p){
                _a = a.charAt(p);
            }
            if(m > p){
                _b = b.charAt(p);
            }
            s.append(sum(_a,_b));
            p ++;
        }
        if(f == 1){
            s.append('1');
        }
        return s.reverse().toString();
    }
    static char sum(char _a,char _b){
        int a = _a - 48,b = _b -48;
        int result = a + b + f;
        if(result > 1){
            f = 1;
        }else f = 0;
        return (char)(result % 2 + '0');
    }
    static String revert(char[] s){
        int left = 0,right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
        return String.valueOf(s);
    }

}
