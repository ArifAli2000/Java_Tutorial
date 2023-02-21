//how to create exeption...
class AgeInvalidException extends Exception
{
	AgeInvalidException()
	{
		super("Age is Invalid");

	}
	 AgeInvalidException(String message)
	{
		super(message);
	}
}


class Example
{
	public static void main(String args[]) {
		System.out.println("Started..");

		try
		{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println("We have got two numbers");
		int result=n1/n2;
		System.out.println("Division is "+result);
		
		if(n2<10)
			{
				throw new AgeInvalidException("My age is Invalid !!");

			}
	 	}
		catch(ArithmeticException e)
		{
			System.out.println("n2 can not be o !!");
			System.out.println("e.getMessage()");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid numbers !!");
			System.out.println("e.getMessage()");
		}
		catch(AgeInvalidException e){
			System.out.println("Invalid n2");
			System.out.println("e.getMessage()");
		}
		catch(Exception e){
			System.out.println("Error !!");
			System.out.println("e.getMessage()");
		}

		finally
		{
			System.out.println("I am in finally block");
			System.out.println("Closing all the resources..");
		}
		System.out.println("Terminated..");
	}
}