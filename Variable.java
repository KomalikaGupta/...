class Variables
{
	private int instanceVar = 10;
	public static int staticVar;

	public static void main(String[] args)
	{
		Variables va = new Variables();
		int localVar = 4;
		System.out.println("local variable: "+localVar);
		System.out.println("instance variable: "+va.instanceVar);
		System.out.println("static variable: "+staticVar);
	}
}
