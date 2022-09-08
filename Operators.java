//wrp to demo all kind of operators in single program.
class Operators
{
	public static void main(String[] args)
	{
		int a=10, b=20;
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);

		System.out.println(" Arthmetic Operators : +");
                System.out.println("A+B = "+(a+b));
		
		System.out.println(" Assignment Operator : =");

		int c = b;
		int d = a+5;
		int e = a+b;
		System.out.println("Value of C : "+c);
		System.out.println("Value of D : "+d);
		System.out.println("Value of E : "+e);

		System.out.println(" Multiple Assignment Operator : +=");

		
		c+=5;//{c=c+5}=25
		System.out.println("c+=5; : "+c);
		

		System.out.println(" Relational Operator : >,<");

		System.out.println("Value of A : "+a);//100
		System.out.println("Value of B : "+b);//2
		System.out.println("Value of C : "+c);//25;
		System.out.println("Value of D : "+d);//0;
		System.out.println("A>B : "+(a>b));
		System.out.println("C<D : "+(c<d));
		

		System.out.println(" Logical Operator : &&");

		
		System.out.println("Value of A : "+a);//25;
		System.out.println("Value of B : "+b);//5;
		System.out.println("Value of C : "+c);//0;
		System.out.println("(A>B)&&(B<A)&&(C!=A) : "+((a>b)&&(b<a)&&(c!=a)));
		System.out.println("(C==B)&&(B<C)&&(C<A) : "+((c==b)&&(b<c)&&(c<a)));
		

		System.out.println(" Unary Operator : ++, --");

		int x,y,z;
		x=5;
		y=++x;
		++x;
		x++;
		z=x-- + --y;//8+5=13 (after operation value of x=7 and y=5)
		System.out.println("Value of X : "+x+" Valur of Y : "+y+" Vlaue of Z : "+z);

		System.out.println(" Ternary Operator : ? , : ");
		System.out.println("Syntax : (cond)? v1 : v2; ");
		int m1, m2, m3;
		String res;
		m1=50;
		m2=40;
		m3=90;
		res=(m1>=35 && m2>=45 && m3>=40)?"Passed":"Failed";
		System.out.println(res);
		
		System.out.println(" Bitwise Operator : &,|,^,<<,>>,~");
		int a1,b1,c1;
		a1=5;
		b1=7;
		c1=9;
		System.out.println("The value of A : "+a1+" The value of B : "+b1+" The value of C : "+c1);
		System.out.println("The binary of a1 : "+Integer.toBinaryString(5)+" The binary of b1 : "+Integer.toBinaryString(7)+" The binary of c1 : "+Integer.toBinaryString(9));
		System.out.println("Operation of Bitwise AND Operator A & B & C : "+(a1&b1&c1));
		System.out.println("Operation of Bitwise OR Operator A | B | C : "+(a1|b1|c1));
		System.out.println("Operation of Bitwise XOR Operator A ^ B ^ C : "+(a1^b1^c1));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator A >> : "+(a1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator A >> : "+(a1>>2));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator B >> : "+(b1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator B >> : "+(b1>>2));
		System.out.println("Operation of Bitwise and Right Shift (3) Operator C >> : "+(c1>>3));
		System.out.println("Operation of Bitwise and Right Shift (2) Operator C >> : "+(c1>>2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator A << : "+(a1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator A << : "+(a1<<2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator B << : "+(b1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator B << : "+(b1<<2));
		System.out.println("Operation of Bitwise and Left Shift (3) Operator C << : "+(c1<<3));
		System.out.println("Operation of Bitwise and Left Shift (2) Operator C << : "+(c1<<2));
		System.out.println("Complement of A = "+(~a1));
		System.out.println("Complement of B = "+(~b1));
		System.out.println("Complement of C = "+(~c1));
	}
}
