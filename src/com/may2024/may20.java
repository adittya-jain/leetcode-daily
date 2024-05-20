package com.may2024;

import java.util.ArrayList;

public class may20 {
}
class SolutionMay20 {
    private static int calculateXOR(ArrayList<Integer> ll) {
        if(ll.isEmpty())return 0;
        int temp = ll.getFirst();
        for (int i = 1; i < ll.size(); i++) {
            temp = temp ^ ll.get(i);
        }
        return temp;
    }

    private static int subsetSumXOR(int[] nums, int i, ArrayList<Integer> ll,int n){
        if(i==n){
            return calculateXOR(ll);
        }
        ll.add(nums[i]);
        int r = subsetSumXOR(nums,i+1,ll,n);
        ll.removeLast();
        int s = subsetSumXOR(nums,i+1,ll,n);
        return r+s;
    }

    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> ll = new ArrayList<>();
        int n = nums.length;
        return subsetSumXOR(nums,0,ll,n);
    }
}
