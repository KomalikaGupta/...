class Seq3
{
public static void main(String[] args)
{
	int k=0,l=1,m;
	System.out.print(k+" , "+l+" , ");
	for(int i=0;i<=10;i++)
	{
		m=k+l;
		System.out.print(m+" , ");
		k=l;
		l=m;
	}
	
}
}
