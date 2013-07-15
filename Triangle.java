package Programs;
import java.math.*;
public class Triangle {
public static void main(String[] args) {
	int a=3;
	int b=4;
	int c=5;
	if((c^2)==(a^2+b^2))
	{
		System.out.println("Right angled triangle");
	}
	else if((c^2)<(a^2+b^2))
	{
		System.out.println("Acute angled triangle");
	}
	else if((c^2)>(a^2+b^2))
	{
		System.out.println("Obtuse angled triangle");
	}
	
	if(a==b&&a==c)
	{
		System.out.println("Equilateral Triangle");
	}
	else if(a==b||a==c||b==c)
	{
		System.out.println("Isoceles triangle");
	}
}
}
