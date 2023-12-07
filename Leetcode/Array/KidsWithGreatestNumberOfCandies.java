package Leetcode.Array;

import java.util.*;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> isGreatest = new ArrayList<Boolean>(n);
        int maxCandies = maxCandy(candies);

        for (int i = 0; i < n ; i++) {
            candies[i] += extraCandies;
            if(candies[i] >= maxCandies){
                isGreatest.add(i, true);
            } else {
                isGreatest.add(i, false);
            }
        }
        return isGreatest;
    }
    static int maxCandy(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }


}
