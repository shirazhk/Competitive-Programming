import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(),sum=0;
        for(int i=1;i<=t;i++)
        {
            int n=s.nextInt();
            int[][] a = new int[n][n];
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    a[j][k] = s.nextInt();
                }
            }//input complete
            for(int m=0;m<n;m++)
            {
                sum+=a[0][m];
            }//top row
            for(int m=0;m<n;m++)
            {
                sum+=a[n-1][m];
            }//bottom row
            for(int m=1;m<n-1;m++)
            {
                sum+=a[m][0];
            }//left column
            for(int m=1;m<n-1;m++)
            {
                sum+=a[m][n-1];
            }//right column
            for(int m=1;m<n-1;m++)
            {
                sum+=a[m][m];
            }//left diagonal
            for(int r=n-2,c=1;c<n-1;c++,r--)
            {
                sum+=a[r][c];
            }//right diagonal
            if(n%2!=0)//odd number of rows means diagonals intersect
            {
                sum-=a[n/2][n/2];
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
