import java.util.*;

public class arrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers :");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the element to check :");
        int get = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == get) {
                System.out.println(arr.remove(i));
                n = n - 1;
            }
        }
        System.out.println(arr);
    }
}
// user-> n iter
// enter the element to remove -> check and remover or ilaaa
