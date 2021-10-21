import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }//input complete
        boolean flag=false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                if(sum>target)
                {
                    al.clear();
                    continue;
                }
                else if (sum<target)
                {
                    al.add(a[j]);
                    sum+=a[j];
                }
                else if(sum==target)
                {
                    flag=true;
                    System.out.println(flag);
                    for(int k:al)
                    {
                        System.out.print(k+" ");
                    }
                    al.clear();
                    sum=0;
                }
            }
            al.clear();
            if(flag==true)
            break;
        }
        if(flag==false)
            System.out.print(flag);
    }
}
