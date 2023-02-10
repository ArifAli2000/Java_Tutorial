//If_else
class IfExample
{
    public static void main(String args[]) {
        int n = -14;

        if (n > 0) {
            System.out.println("Yes it is");
        } else {
            System.out.println("No it is not");
        }
        //lader if_else
        int m = 81;
        if (m > 80) {
            System.out.println("Grade A");
        } else if (m > 70 && m <= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }
        //Nested if
        int num=121;
        if (num>0)
        {
            if(num%2 ==0)
            {
                System.out.println("It is odd and greater than0");
            }
        }
    }
}
