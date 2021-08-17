package com.wyl;

public class KMP {
    public Integer kmpAlgorithm(String father,String son){
        //father:BBC ABCDAB ABCDABCDABDE
        //son:ABCDABD
        //制作部分匹配表
        int[] partMarchTable = new int[son.length()];
        for(int i = 0;i < son.length();i++){
            int left = 0;
            int right = i;
            if(left == right){
                partMarchTable[i] = 0;
                continue;
            }


        }
        return null;
    }
}
