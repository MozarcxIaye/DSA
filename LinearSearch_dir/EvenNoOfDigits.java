package LinearSearch_dir;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {8, 1243, 9, 1764, 98, 1};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] arr){
        int count = 0;
            for(int el : arr) {
                if(Even(el)){
                    count++;
                }
            }
        return count;
    }

    static boolean Even(int num){
        int numberOfDigits = digits2(num);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1; //  to return the number of digits
    }



}
