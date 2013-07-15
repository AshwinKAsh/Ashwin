package Programs;

public class NotFibonacciSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int series = 0;
	for(int i=0;i<10;i++ )
	{
		series=a+b;
		a=b;
		b=series;
		//System.out.print(" "+series);
	
	}
	for(int k=4;k<100;k++)
		if(k!=series)
		{
			System.out.print(" "+k);
		}
}
}
