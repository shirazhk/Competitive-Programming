import java.util.*;
public class countingDigits {
    
    static int count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int d = count(n/10)+1;
        return d;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        System.out.println(n+" has "+count(n)+" digits.");
    }
}
