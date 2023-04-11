// import java.util.*;
// public class removeWhiteSpace {
//    public static void main(String [] args) {
//     // String str = "     java     ";
//     // String trimmedString = str.trim();
//     // System.out.println(trimmedString);
//     String str = "   ja   va str ing   ";
//     String trimmed = str.replaceAll(" ", "");
//     System.out.println(trimmed);
//    }
// }
import java.util.*;
public class removeWhiteSpace{
    public static void main(String [] args){
        String [] str = {"jav strin g","av er age","ry in "};
        for(int i = 0;i<str.length;i++){
            str[i] = str[i].replaceAll(" ","");
        }
        for(int i = 0;i<str.length;i++){
             System.out.println(str[i]);
        }
    }
}
