package Programs;

public class No3 {
	public static void main(String[] args) {
		int i=4;
		for(int j=1;j<=i;j++)
		{
			for(int l=0;l<i-j;l++)
			{
				System.out.print(" ");
			}
			
			for(int m=j;m>1;m--)
			{
				System.out.print(m);
			}
			
			for(int k=1;k<=j;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
