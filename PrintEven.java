import java.util.*;

class PrintEven
{
	public static void main(String args[] )
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to print even numbers");
		System.out.print("start: ");
		int start = sc.nextInt();
		System.out.print("end: ");
		int end = sc.nextInt();
		for(int i = start ; i < end; i++)
		{
			if(i%2 == 0)
				System.out.print(i+" ");
		}
	}
}
