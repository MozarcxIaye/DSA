package LinearSearch_dir;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "mozarcx";
        char target = 'm';
        System.out.println(searchInString(name, target));
        System.out.println(searchInStringOptimized(name, target));
    }

    public static boolean searchInString(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static boolean searchInStringOptimized(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for(char el : str.toCharArray()){
            if(el == target) {
                return true;
            }
        }
        return false;
    }


}
