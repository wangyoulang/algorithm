package com.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScanModel {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String ms = scan1.nextLine();
        Map<Integer,Integer> map = new HashMap<>();
        String[] news = ms.split(",");
        int b = Integer.valueOf(news[0]);
        System.out.println();


//        Scanner scan2 = new Scanner(System.in);
//        String mss = scan2.nextLine();
//        String nss = scan2.nextLine();
//        int m = Integer.parseInt(mss);
//        int n = Integer.parseInt(nss);
//        char[][] hiveGrid = new char[m][n];
//        int index = 0;
//        //     List<String> hiveList = new ArrayList<>();
//        while(scan2.hasNextLine()){
//            hiveGrid[index++] = scan2.nextLine().toCharArray();
//        }
    }
}