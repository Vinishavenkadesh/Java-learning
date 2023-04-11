import java.util.*;
public class methods {
    public static void main(String [] args){
        String [] string = new String[10];
        String [] str = {"sachin","sahanna","shinguh"};
        for(int i = 0;i<str.length;i++){
            if(str[i].startsWith("sa")){
                string[i] = str[i];
            }
        }
        for(int i = 0;i<string.length;i++){
            System.out.println(string[i]);
        }
    }
}
