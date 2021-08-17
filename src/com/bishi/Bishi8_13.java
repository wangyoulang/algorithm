package com.bishi;

import java.lang.reflect.Array;
import java.util.*;

public class Bishi8_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ns = scan.nextLine();
        Integer n = Integer.parseInt(ns);//单词个数
        List<String> input = new ArrayList<>();
        while(scan.hasNextLine()){
            input.add(scan.nextLine());
        }
    }
    public void printFun(List<String> param,Integer num){
        Map<String,Integer> characterMap = new HashMap<>();
        for(String item:param){
            if(characterMap.containsKey(item)){
                characterMap.put(item,characterMap.get(item) + 1);
            }else {
                characterMap.put(item,1);
            }
        }
        int maxValue = 0;
        for(Integer value:characterMap.values()){
            maxValue = maxValue > value ? maxValue:value;
        }
        List<String> resultList = new ArrayList<>();
        for(String key:characterMap.keySet()){
            if(characterMap.get(key) == maxValue){
                resultList.add(key);
            }
        }
        int len = resultList.size();
        int[][] result = new int[len][10];
        for(int j = 0;j < 10;j ++){
            for(int i = 0;i < len;i ++){
                if(resultList.get(i) != null){
                    int temp = resultList.get(i).charAt(j);
                    result[i][j] = temp;
                }
            }
        }

    }
}
