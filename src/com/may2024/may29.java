package com.may2024;

public class may29 {
    public static void main(String[] args) {
        String s = "1101";
        SolutionMay29 obj  = new SolutionMay29();
        System.out.println(obj.numSteps(s));
    }
}
class SolutionMay29 {
    public int numSteps(String s) {
        int l = s.length() - 1;
        int carry = 0;
        int count = 0;

        while (l > 0) {
            // even number with carry = 0, result even
            if (Character.getNumericValue(s.charAt(l)) + carry == 0) {
                carry = 0;
                count++;
                // odd number with carry = 1, result even
            } else if (Character.getNumericValue(s.charAt(l)) + carry == 2) {
                carry = 1;
                count++;
                // even number with carry = 1, result odd
                // odd number with carry = 0, result odd
            } else {
                carry = 1;
                count += 2;
            }
            l--;
        }

        // last digit 1 needs to add a carried over digit 1, which gives 10.
        // So need one more divide to make it 1 (one more step)
        if (carry == 1) {
            count++;
        }

        return count;
    }
}
