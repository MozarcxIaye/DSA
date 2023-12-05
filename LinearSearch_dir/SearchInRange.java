package LinearSearch_dir;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 4 ,53, 5, 6, 7, 22, 63};
        int target = 4;
        int start = 0;
        int end = 6;
        System.out.println(searchInRange(arr, target, start, end));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
