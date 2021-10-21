import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }//input complete
        for(int j=0;j<n/2;j++)
        {
            int t = a[j]+a[n-j-1];
            System.out.println(t/10+" "+t%10);
        }
    }
}
