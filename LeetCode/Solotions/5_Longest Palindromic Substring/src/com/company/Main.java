package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String str = "aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa";
        System.out.println(longestPalindrome(str));
	// write your code here
    }

    public static String longestPalindrome(String s) {
        String sub = "";

        // Start with the loop, Trying the biggest value first.
        for (int i = 0; i < s.length(); i++){

                // n = The length I need to check of the string.
                int n = (s.length()-i);
                int c = 0;

                // Checking if i + n = not out of bounds.
                while(n + c <= s.length()){
                    System.out.println("C = " + c);
                    // Now to check if the string is Palindrome

                    sub = s.substring(c, n + c);

                    if (sub.length() == 2){
                        // 2 char left
                        if (sub.charAt(0) == sub.charAt(1)){
                            return sub;
                        }
                    } else {
                        // odd

                        // Checking if there is 1 char left.
                        if (sub.length() == 1){
                            return sub;
                        }else{
                            Integer len = Integer.valueOf((int) Math.floor(Double.valueOf(sub.length()) / 2));
                            Integer r = 0;
                                while (r <= len){
                                    if ( String.valueOf(sub.charAt(r)).equalsIgnoreCase(String.valueOf(sub.charAt(sub.length() - r - 1)))){
                                        if (r >= len){
                                            return sub;
                                        }
                                        r++;
                                    } else {
                                        r = sub.length() + 1;
                                    }
                                }
                        }
                    }
                    c++;
                }
        }
        return "0";
    }
}
