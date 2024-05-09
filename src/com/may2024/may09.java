package com.may2024;

import java.util.Arrays;
import java.util.Map;

public class may09 {
    //Time Complexity = nlogn + k
    //This is according to me, correct me if I'm wrong
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int turns = 0;
        long sum = 0;
        for (int i = happiness.length-1; i>=0 ; i--) {
            if(turns == k) break;
            sum = sum + Math.max(happiness[i]-turns,0);
            turns++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] happiness = {1,2,3};

        System.out.println(maximumHappinessSum(happiness,2));
    }
}
