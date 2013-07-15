package Programs;
public class PrimeNo {
	public static void main(String[] args) {
	int num=10;
	int flag=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			System.out.println("The number is not a prime");
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("The number is a prime");
	}
	}
}

 