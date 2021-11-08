import java.util.*;
public class checkNumberPresenceInArrayRecursion {
    
    static boolean numberPresent(int[] ar, int index, int num)
    {
        boolean present = false;
        if(index==ar.length)
        {
            return false;
        }
        if(num == ar[index])
        {
            present = true;
            return present;
        }
        present = numberPresent(ar,index+1,num);
        return present;
    }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        System.out.println("Enter elements separated by whitespace");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int num = s.nextInt();
        boolean present = numberPresent(a,0,num);
        System.out.println((present==true)?"The number was found in the array.":"The number was not found in the array.");
    }
}
