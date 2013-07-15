package PassByValue;

public class Primitive {
	public static void main(String[] args) {
	int i=5;
	System.out.println(i);
	Primitive primitive=new Primitive();
	primitive.change(i);
	System.out.println(i);
	}
	void change(int i)
	{
		i=10;
	}
}
