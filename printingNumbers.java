import java.util.*;
public class printingNumbers {
    
    static int printNum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        System.out.println(printNum(n-1));
        return n;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int n = s.nextInt();
        System.out.println("Printing:");
        System.out.println(printNum(n));
    }
}
