import java.util.*;
public class lastIndexOfNumberRecursion {
    
    static int lastIndex(int[] ar, int index,int num)
    {
        if(index==ar.length)
        {
            return -1;
        }
        if(ar[index]==num)
        {
            int nextIndex = lastIndex(ar,index+1,num);
            if(nextIndex>index)
                return nextIndex;
            else
                return index;
        }
        int n = lastIndex(ar,index+1,num);
        return n;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        System.out.println("Enter elements separated by whitespace");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter number to be searched:");
        int num = s.nextInt();
        System.out.println("Last Index of "+num+" in array: "+lastIndex(a, 0, num));
    }
}
