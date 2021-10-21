import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(),sum=0;
        int[] a  = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
            if((i%2==0)&&(a[i]%2==0))
            {
                e+=a[i];
            }
            else if((i%2!=0)&&(a[i]%2!=0))
            {
                o+=a[i];
            }
        }
        System.out.print(e+" "+o);
    }
}
