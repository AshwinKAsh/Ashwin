package Programs;

public class ArmstrongNumber {
public static void main(String[] args) {

	int armstrongNumber;
	int remainder;
    int cube=0;
    int i=371;
    int k=i;
		for(int j=0;j<=2;j++)
		{
		remainder=i%10;
		i=i/10;
		cube+=remainder*remainder*remainder;
		}
		if(k==cube)
		System.out.println(cube);
}
}
