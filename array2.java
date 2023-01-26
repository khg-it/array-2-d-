
import java.util.*;

public class array2 {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row_size=sc.nextInt();
        int col_size=sc.nextInt();
        int ar[][]=new int[row_size][col_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    

    }
        }
