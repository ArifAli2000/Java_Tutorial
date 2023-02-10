import java.util.Scanner;

class InputDemo
{
    public static void main(String args[])
    {
        int a,b,r;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the first no");
        a=S.nextInt();
        System.out.println("enter the second no ");
        b=S.nextInt();
        r=a+b;
        System.out.println("sum= "+r);

    }
}
