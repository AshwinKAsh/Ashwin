package Programs;

public class Series {
public static void main(String[] args) {
	double a=1;
	double b=1;
	double series=0.0;
	for(int i=0;i<6;i++)
	{
		series=series+a/b;
		b+=2;
	}
	System.out.println(series);
}
}
