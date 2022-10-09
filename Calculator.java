//Q.2. wrp To input 5 subject marks for 5 students and calculate total,avg,result using arrays

import java.util.*;
class Calculatemarks
{
	void inpt()
	{
		double[][] marks=new double[5][5];
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double avg=1;
		int count=0;
		System.out.println("Enter Makrs of the Students......");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Marks of Student "+i+" : ......");
			for(int j=0;j<5;j++)
			{
				System.out.print("Enter the Marks for Subject "+j+" : ");
				marks[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n Printing Student Marks..........\n\n");
		for(int i=0;i<5;i++)
		{
			System.out.println(" \n Marks of Student "+i+" : ........\n");
			for(int j=0;j<5;j++)
			{
				System.out.println(" Marks for Subject "+j+" : "+marks[i][j]);
			}
		}

		System.out.println("\n Printing Total Marks of Students...... : \n");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				sum=sum+marks[i][j];
			}
			System.out.println("\nSum of Total marks of Student "+i+" is : "+sum);
			avg=sum/5;
			System.out.println("Avarage of Total marks of Student "+i+" is : "+avg);
			sum=0;
		}

		System.out.println("\n Printing Result of Students...... : \n");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(marks[i][j]>=40)
				count++;
				else
				{
				System.out.print("");
				}
			}
			if(count==5)
			System.out.println("Student "+i+" is Pass...!!!!!");
			else
			System.out.println("Student "+i+" is Fail...!!!!!");
			count=0;
		}
			
	}
	

	public static void main(String[] args)
	{	
		Calculatemarks c = new Calculatemarks();
		c.inpt();
		
	}
}
