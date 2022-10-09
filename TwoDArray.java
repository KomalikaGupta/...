//Q.1. wrp to make menu driven using 2d-arrays
import java.util.*;
class Twodarray		//Class creation
{
	public static void main(String args[])
	{
		int[][] a=new int[2] [2]; //each array 2 elements total = 4
		int[][] b=new int[2] [2]; //each array 2 elements total = 4
		int[][] c=new int[2] [2];
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first 2x2 array elements : ");
		for(int i=0; i<=1; i++) //array index
		{
			for(int j=0; j<=1; j++)//element index
			{
				System.out.println("Value of "+i+" "+j+" index : ");
				a[i][j]=sc.nextInt(); //teking value from user
			}
		}
		System.out.println("Printing the first array : ");
		for(int i=0; i<=1; i++) //array index
		{
			for(int j=0; j<=1; j++)//element index
			{
				System.out.print(a[i][j]+ " "); //Printing array index wise
			}
			System.out.println();
		}

		System.out.println("Enter the Second 2x2 array elements : ");
		for(int i=0; i<=1; i++) //array index
		{
			for(int j=0; j<=1; j++)//element index
			{
				System.out.println("Value of "+i+" "+j+" index : ");
				b[i][j]=sc.nextInt(); //teking value from user
			}
		}
		System.out.println("Printin the second array : ");
		for(int i=0; i<=1; i++) //array index
		{
			for(int j=0; j<=1; j++)//element index
			{
				System.out.print(b[i][j]+ " "); //Printing array index wise
			}
			System.out.println();
		}

		System.out.println("For addition enter - '1', For multiplication enter - '2' For transpose enter - '3'");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Addition of Array is : ");
			for(int i=0; i<=1; i++)
			{
				for(int j=0; j<=1; j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
			System.out.println();
			}
			break;

			case 2:
			System.out.println("Multiplication of Array is : ");
			for(int i=0; i<=1; i++)
			{
				for(int j=0; j<=1; j++)
				{
					c[i][j]=a[i][j]*b[i][j];
					System.out.print(c[i][j]+" ");
				}
			System.out.println();
			}
			break;
			case 3:
			System.out.println("Transpose of Array is : ");
			System.out.println("Before Transpose first array : ");
			for(int i=0; i<=1; i++) //array index
			{
				for(int j=0; j<=1; j++)//element index
				{
				System.out.print(a[i][j]+ " "); //Printing array index wise
				}
			System.out.println();
			}

			System.out.println("After Transpose first array : ");
			for(int i=0; i<=1; i++) //array index
			{
				for(int j=0; j<=1; j++)//element index
				{
				System.out.print(a[j][i]+ " "); //Printing array index wise
				}
			System.out.println();
			}

			System.out.println("Transpose of Array is : ");
			System.out.println("Before Transpose Second array : ");
			for(int i=0; i<=1; i++) //array index
			{
				for(int j=0; j<=1; j++)//element index
				{
				System.out.print(b[i][j]+ " "); //Printing array index wise
				}
			System.out.println();
			}

			System.out.println("After Transpose Second array : ");
			for(int i=0; i<=1; i++) //array index
			{
				for(int j=0; j<=1; j++)//element index
				{
				System.out.print(b[j][i]+ " "); //Printing array index wise
				}
			System.out.println();
			}

			break;
			default:
			System.out.println("Please Choose the Correct option");
			
		}
	}
}
