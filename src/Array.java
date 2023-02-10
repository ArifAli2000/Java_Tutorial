import java.util.Scanner;
//1D array
/*class Array
{
    public static void main(String args[])
    {
        //declaring 1d Array
        int a[]=new int[5];
        System.out.println("enter the no");
        Scanner S= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=S.nextInt();
        }
    }
}*/
//2D Array
class Array
{
    public static void main(String args[])
    {   int i,j;
        Scanner s= new Scanner(System.in);
        int a[][]=new int[4][2];
        System.out.println("enter the element of array ");
        for( i=0;i<a.length;i++)
        {
            for ( j = 0; j < a.length; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Elements array are");
        for( i=0;i<a.length;i++) {
            for (j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
            }
        }

    }
}
