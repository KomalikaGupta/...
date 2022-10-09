	//Q.2. wrp To calculate sum of two numbers function if my input char is 'y' [yes] to continue again otherwise to stop process
import java.util.*;
class Sum
{
	void add(int m, int n)
	{
		System.out.println("Sum of "+m+" + "+n+" is : "+(m+n));
	}
	void sub(int m, int n)
	{
		System.out.println("Subtraction of "+m+" - "+n+" is : "+(m-n));
	}
	void mul(int m, int n)
	{
		System.out.println("Multiplication of "+m+" * "+n+" is : "+(m*n));
	}
	public static void main(String[] args)
	{
		Sum s=new Sum();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		do
		{
			int a1, b1;
			System.out.println("Enter first number : ");
			a1=sc.nextInt();
			System.out.println("Enter second number : ");
			s1=sc.nextInt();
			s.add(a1,b1);
			s.sub(a1,b1);
			s.mul(a1,b1);
			System.out.println("Enter 'Y' to continue again : ");
			ch=sc.next().charAt(0);
			ch=Character.toUpperCase(ch);
		}
                        while(ch=='Y');
	}

}
