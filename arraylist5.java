import java.util.*;

public class arraylist5 {
    public static void main(String[] args) {
        String str = "RACEECAR";
        int flag = 0;
        int j = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not a palindrome");
                flag = 1;
                break;
            }
            j--;
        }
        if(flag==0)
        System.out.println("Is a palindrome");

    }
}
