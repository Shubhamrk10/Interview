class A

{
	public static void main(String[] args) 
	{
		int num = 123;
		int number, temp;
		int total = 0;

		number = num;

		while(number!=0){
			temp = number%10;
			total = number*10 + temp;   //+27
			number = number/10;

			System.out.println(total);
		}
		
	}
}
