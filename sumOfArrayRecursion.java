import java.util.*;
public class sumOfArrayRecursion {
    
    static int sumArray(int[] ar, int index)
    {
        if(index==ar.length)
        {
            return 0;
        }
        int sum = ar[index]+ sumArray(ar,index+1);
        return sum;
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
        System.out.println("The sum of elements of the array is: "+sumArray(a,0));
    }
}
