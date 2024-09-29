import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        String name= "Subrato";
        char target= 'S';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchUsingForEach(name, target));
        // System.out.println(search(name, target));
    }

    static boolean searchUsingForEach(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }


    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0 ; i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
