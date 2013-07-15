package Programs;

public class No4 {
public static void main(String[] args) {
	int i=5;
	for(int j=1;j<=i;j++)
	{
		for(int l=0;l<i-j;l++)
		{
			System.out.print(" ");
		}
		
		for(int m=j;m>0;m--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
