	class StarPattern
{
	public static void main(String[] args)
{
	for(int i=5;i>=1;i--)
	{
	   if(i==2)
	   {
	     continue;
	   }
       for(int j=1;j<=i;j++)
         {
           System.out.print("*");
           }
		System.out.println();
	}

}
}
