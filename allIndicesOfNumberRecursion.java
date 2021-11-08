import java.util.*;
public class allIndicesOfNumberRecursion {
    
    static void indicesOfNum(int[] ar, int index, int num)
    {
        if(index==ar.length)
            return;
        if(ar[index]==num)
            System.out.println(index);
        indicesOfNum(ar,index+1,num);
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
        System.out.println("Printing indices of all occurrences of "+num+" in array.");
        indicesOfNum(a, 0, num);
        System.out.println("Program execution complete.");
    }
}
