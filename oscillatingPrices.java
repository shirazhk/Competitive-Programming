import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(s.nextInt());
        }//input complete
        int m = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int d = a.get(j)-a.get(i);
                if(d>m)
                    m=d;
            }
        }
        System.out.print(m);
    }
}
