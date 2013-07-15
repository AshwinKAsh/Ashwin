package Programs;

public class StrDelete {
public static void main(String[] args) {
	StringBuffer buffer= new StringBuffer("SDDFHDJKKLL");
	for(int j=0;j<1000;j++)
	{
		for(int i=0;i<buffer.length()-1;i++)
		{
			if(buffer.charAt(i)==buffer.charAt(i+1))
				buffer=buffer.delete(i, i+2);
		}
	}
	System.out.println(buffer);
}
}
