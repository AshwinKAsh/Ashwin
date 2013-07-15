package Programs;

public class No2 {
	public static void main(String[] args) {
		int i=5;
		for(int j=1;j<=i;j++)
		{
			for(int k=1;k<=j;k++)
			{
			System.out.print(k);
			}
			System.out.println(" ");
		}
		for(int j=i;j>0;j--)
		{
			for(int k=1;k<j;k++)
			{
			System.out.print(k);
			}
			System.out.println(" ");
		}
		
	}
}
