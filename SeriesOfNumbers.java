package Programs;

public class SeriesOfNumbers {
public static void main(String[] args) {
	int array[]={5,8,15,5,6,-8,1,9,0};
	int count = 0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]<0)
		{
			break;
		}
		count++;
	}
	System.out.println("The no of Positive integers in first set is: "+count);
	System.out.print("The no of Positive integers in Second set is: ");
	System.out.println((array.length)-count-1);
}
}
