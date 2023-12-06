package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        int targ = 3;
        int target = 6;
        System.out.println(OrderAgnosticBinarySearch(arr, targ));
        System.out.println(OrderAgnosticBinarySearch(arr2, target));

    }


    static int OrderAgnosticBinarySearch (int[] arr, int target) {
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
        return -1;

    }

}
