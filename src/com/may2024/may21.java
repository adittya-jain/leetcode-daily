package com.may2024;

import java.util.ArrayList;
import java.util.List;

public class may21 {
}
class SolutionMay21 {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ll = new ArrayList<>();
        subsetfind(nums, 0, ll, new ArrayList<>(), n);
        return ll;
    }

    private static void subsetfind(int[] nums, int i, List<List<Integer>> ll, List<Integer> list, int n) {
        if (i == n) {
            ll.add(new ArrayList<>(list)); // Add a copy of the current list
            return;
        }

        // Include the current element
        list.add(nums[i]);
        subsetfind(nums, i + 1, ll, list, n);

        // Exclude the current element
        list.remove(list.size() - 1);
        subsetfind(nums, i + 1, ll, list, n);
    }

}
