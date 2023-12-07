package Leetcode.Array;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {5, 2, 3},
                {3, 2, 1}
        } ;
        System.out.println(richest(accounts));
    }


    /*
   * * Approach 1

    static int richest(int[][] arr) {
        int maxWealth = 0;
        for (int i = 0; i < arr.length; i++) {
            int wealth = sum(arr[i]);
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

*/

    /*
    * * Approach 2
    * */

    static int richest(int[][] arr) {
        int maxWealth = 0;
        for (int[] customer: arr) {
            int wealth = Arrays.stream(customer).sum();
            if(wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

}
