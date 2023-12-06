package BinarySearch;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 8, 10, 14, 16, 17, 24};
        int target = 4;
        System.out.println(BinarySearch(arr, target));
    }
    static int BinarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }


}
