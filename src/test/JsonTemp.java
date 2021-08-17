package test;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JsonTemp {

    @Test
    public void test(){

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        System.out.println();
    }
    @Test
    public void test0(){
        BigDecimal a = new BigDecimal(-6);
        BigDecimal aa = new BigDecimal(2.2);
        System.out.println(a.divide(aa,4,BigDecimal.ROUND_HALF_UP));
    }
    @Test
    public void listToListTest(){
        String str = "重庆市 巴南区 尚盟工业园区 C区17栋  四路 2楼办公室";
        String s = str.replace(" ","");
        System.out.println();

    }
    @Test
    public void jsonTransform(){

//        String js = "浙江省杭州市萧山区临时街道221号";
//        String jsTrans = js.substring(6,9);//左闭右开
//        System.out.println(jsTrans);
        Scanner scan = new Scanner(System.in);
//        scan.next
        List<String> list = new ArrayList<>();

        String a = "aa";
        String b = "aa";
        String aa = "aa";
        String bb = "aa";
        list.add(a);
        list.add(b);
        list.add(aa);
        list.add(bb);
        int aaa= 0;
        aaa++;
//        Object aaa = list.toArray();
        boolean flag = a.equals(b);
        System.out.println();
    }
}
