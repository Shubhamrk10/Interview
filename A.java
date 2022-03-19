class A

{
	public static void main(String[] args) 
	{
		int num = 153;
		int number, temp;
		int total = 0;

		number = num;

		while(number!=0){
			temp = number%10;
			total = total + temp*temp*temp;   //+27
			number = number/10;

			
		}
		if (num==total)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not Amstrong Number");	
		}
		
	}
}
