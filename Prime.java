class Prime
{
	public static void main(String[] args) 
	{
		int num = 5;
		int count = 0;

		if (num>1)
		{
			for (int i=0;i<num ;i++ )
			{
				if (num%i==0)
				{
					count++;
				}
				if (count==2)
				{
					System.out.println("Is a prime number ");
				}
				else{
					System.out.println("Not a prime number: ");
				}
			}
			
		}
		else{
			System.out.println("Not a prime number ");
		}
	}
}