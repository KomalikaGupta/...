import java.util.Scanner;
class Datatypes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a byte number: ");
		byte by = sc.nextByte();
		System.out.println("Enter a short number: ");
		short sh = sc.nextShort();
		System.out.println("Enter an int number: ");
		int in = sc.nextInt();
		System.out.println("Enter a long number: ");
		long lo = sc.nextLong();
		System.out.println("Enter a float number: ");
		float fl = sc.nextFloat();
		System.out.println("Enter a double number: ");
		double db = sc.nextDouble();
		System.out.println("Enter a boolean: ");
		boolean bo = sc.nextBoolean();
		System.out.println("Enter a String: ");
		String st = sc.next();
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		System.out.println("byte: "+by);
		System.out.println("short: "+sh);
		System.out.println("int: "+in);
		System.out.println("long: "+lo);
		System.out.println("float: "+fl);
		System.out.println("double: "+db);
		System.out.println("boolean: "+bo);
		System.out.println("String: "+st);
		System.out.println("char: "+ch);
		
		
	}
}
