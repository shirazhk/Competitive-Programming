import java.util.*;
public class powerRecursion {
    
    static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int pow = x*power(x,n-1);
        return pow;
        
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x and n separated by whitespace for x^n (n>=0)");
        int x = s.nextInt();
        int n = s.nextInt();
        int result = power(x,n);
        System.out.println(x+"^"+n+" = "+result);
    }
}
