package Compile;

public class Add {

	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void add(int a, double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	add(5,10);
	add(2,1.2);
}
}
