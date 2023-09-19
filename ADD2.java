class ADD2 
{
	public static void main(String[] args) 
	{
		int i=1;

		for (int h=0;h<=100 ;h++ )
		{ 
			if (h%3==0&& h%7==0 )
			{
				i =h+i;
			}
		}
		System.out.println(+i);
	}
}
