import java.util.*;
public class removeDuplicatesInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        System.out.println("Enter elements separated by whitespace.");
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            set.add(s.nextInt());
        }
        System.out.println("Elements after removing duplicates: "+set);
    }
 
}
