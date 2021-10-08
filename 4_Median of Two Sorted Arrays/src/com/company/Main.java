package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] num1 = new int[]{0,0};
        int[] num2 = new int[]{0,0};
        System.out.println(findMedianSortedArrays(num1,num2));
	// write your code here
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> arr = new ArrayList<>();
        try {
            for (Integer i : nums1){
                arr.add(Double.valueOf(i));
            }
            for (Integer i2 : nums2){
                arr.add(Double.valueOf(i2));
            }
            Collections.sort(arr);
            if (arr.size() % 2 == 0){
                Double med = (( arr.get(arr.size() / 2)   + arr.get(arr.size()/2 -1) )/2);
                return med;
            }
            return arr.get(arr.size() / 2);
        }catch (Exception e){
            return 0;
        }
    }
}
