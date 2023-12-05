package LinearSearch_dir;

import java.util.Arrays;

public class SearchingIn2DArr {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 4, 5},
                {4, 45, 67, 8},
                {1, 6}
        };
        int target = 45;
        int[] ans = searching2darr(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searching2darr(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }


}
