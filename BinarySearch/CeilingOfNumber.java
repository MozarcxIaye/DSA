package BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 12, 13, 15};
        int target = 9;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        find the array is sorted ascending or descending

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return start;
    }
}
