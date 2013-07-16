package Programs;

import java.io.*;
import java.util.regex.*;

public class Weather {
	int minNo;
	int maxNo;
	int maximum;
	int minimum=100;
	int minDay;
	int maxDay;

	public String regexPattern = "\\t[\\d\\s]+\\t";

	public void reader(){
	BufferedReader br = null;
	try {
		String sCurrentLine;

		br = new BufferedReader(new FileReader("D:\\weather.txt"));

		while ((sCurrentLine = br.readLine()) != null) {
			sCurrentLine=sCurrentLine.replace("*", " ");
			Pattern pattern=Pattern.compile(regexPattern);
			Matcher matcher=pattern.matcher(sCurrentLine);
			while(matcher.find())
			{
				minNo++;
				maxNo++;
				String array=(String) matcher.group();
				String temp1=array.replace("\t", "");
				String[] temp=temp1.split("\\s+");
				int max=Integer.valueOf(temp[0]);
				int min=Integer.valueOf(temp[1]);
				int change=max-min;
				if(change>maximum)
				{
					maximum=change;
					maxDay=maxNo;
				}
				else if(change<minimum)
				{
					minimum=change;
					minDay=minNo;
				}
			}
		}
		
		System.out.println("Maximum Change in Temperature : " +maximum+ " On Day : " +maxDay);
		System.out.println("Minimum Change in Temperature : " +minimum+ "  On Day : " +minDay);
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

	public static void main(String[] args) {
		new Weather().reader();

	}
}
