	public class Localvar
{
	int i;
	int j=15;

	public void Test()
{
	int a=10; 
	System.out.println("Value of a : "+a);
}

static int b=50;

	public static void main(String[] args)
{
	Localvar loc1 = new Localvar();
	System.out.println("Instance Variable i : "+loc1.i);
	System.out.println("Instance Variable j : "+loc1.j);

	Localvar loc2 = new Localvar();
	loc2.Test();

	System.out.println("Static Variable b : "+Localvar.b);
}
}
