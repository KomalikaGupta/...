import java.util.*;
class Larger//mistake in file name class name and file name should be same
{
	public static void main(String[] args)
     {
	int m,n,o;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers : ");
	m = sc.nextInt(); 
	n = sc.nextInt();
	o = sc.nextInt();


	if(m>n && m>o)
	System.out.println("M is Largest value : "+m);

	else if(n>o && n>m)
	System.out.println("N is Largest value : "+n);

	else
	System.out.println("O is Largest value : "+o);
	
     }
}
