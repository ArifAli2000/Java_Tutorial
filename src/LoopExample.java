class LoopExample
{
    public static void main (String args[]) {
        for (int i = 1; i <= 10; i = i + 3)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i=10; i > 0; i--)
        {
            System.out.print(i +" ");
        }
       int j=50;
        while(j<=60)
        {
            System.out.println(j);
            j++;
        }

        int i=1 ;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<=10);

        int nums[]={1,2,3,4,5};
        for (int x : nums)
        {
            System.out.println(x);
        }
    }
}