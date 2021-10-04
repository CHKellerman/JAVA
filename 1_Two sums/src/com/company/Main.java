package com.company;

public class Main {

    public static int[] main(int nums[], int target) {

        for (int i = 0; i < nums.length; ++i){
            for (int c = 0; c < nums.length;++c){
                if (i != c){
                    if ((nums[i] + nums[c]) == target){
                        return new int[] {0};
                    }
                }
            }
        }

        return new int[] {0};
	// write your code here
    }
}
