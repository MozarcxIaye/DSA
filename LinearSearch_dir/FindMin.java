package LinearSearch_dir;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {123, -234, 34, 45, 52, 63};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }
}
