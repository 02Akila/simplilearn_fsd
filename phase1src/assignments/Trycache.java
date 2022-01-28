package assignments;

public class Trycache {
	
	

		public static void main(String[] args)
		{
			int a,b,c;
			a=2;
			b=0;
			try
			{
				c=a/b;
			}
			catch(ArithmeticException ae)
			{
			System.out.println("Can't divide the number by zero ");
			}
			
		}

	}



