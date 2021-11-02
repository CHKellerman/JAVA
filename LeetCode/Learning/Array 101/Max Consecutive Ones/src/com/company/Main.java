package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));

        // write your code here
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        Integer n = 0;
        Integer iLeng = 0;
        
        for (Integer cur : nums){
            if (cur == 0){
                iLeng = Math.max(n, iLeng);
                n = 0;
            } else {
                n++;
            }
        }
        return iLeng;
    }
}
