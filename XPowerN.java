package Programs;

public class XPowerN {

	static int x=5;
	static int y=2;
	static int res = x;
	public static void main(String[] args) 
	{
		if(y==0)
			System.out.println(1); 
		else{
		for(int i=0;i<y-1;i++)
		{
			res=res*x;
		}
		System.out.println(res);
		}
	}
}
