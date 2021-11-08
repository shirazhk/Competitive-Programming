import java.util.*;
public class firstIndexOfNumberRecursion {
    
    static int indexOfNum(int[] ar, int index, int num)
    {
        if(index==ar.length)
        {
            return -1;
        }
        if(ar[index]==num)
        {
            return index;
        }
        int indexOfNumber = indexOfNum(ar, index+1, num);
        return indexOfNumber;
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
        System.out.println("Index of "+num+" in array: "+indexOfNum(a,0,num));
    }
}
