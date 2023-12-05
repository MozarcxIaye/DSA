package LinearSearch_dir;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {29, 12, 23, 44, 53, 6, 77, 84};
        int target1 = 34;
        int target2 = 24;
        int target3 = 84;

        System.out.println(linearSearch(arr, target1));
        System.out.println(linearSearch(arr, target2));
        System.out.println(linearSearch(arr, target3));

    }


    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }



/*
    * * Solution with enhanced for loop

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for (int el : arr) {
            if (el == target) {
                return el;
            }
        }
        return -1;
    }*/



}
