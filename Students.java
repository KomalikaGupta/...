import java.util.Scanner;

class Student
{
public static void main(String[] args)
{

int std_id; 
String std_name, std_attend; 
 
System.out.println("Enter the Student Name : ");
Scanner sc=new Scanner(System.in); 
std_name=sc.next();	

System.out.println("Enter Student ID : ");
std_id=sc.nextInt();	

System.out.println("Enter Student Attendence Present or Absent 'P' or 'A' : ");
std_attend=sc.next();	

System.out.println("Student Name : "+std_name);	
System.out.println("Student ID : "+std_id);	
System.out.println("Student Attendence : "+std_attend);	
}
}
