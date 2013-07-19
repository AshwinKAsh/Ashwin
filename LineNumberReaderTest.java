package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineNumberReaderTest {
	public static void main(String[] args) {
		int totalLines = new LineNumberReaderTest().countLineNumber();
		int lines = new LineNumberReaderTest().doubleSlash();
		System.out.println("Total Lines " + (totalLines - lines));
	}

	public int doubleSlash() {
		String regexPattern1 = "//";
		String regexPattern2 = "/{1}[*]";
		String regexPattern3 = "[*][/]";
		int count= 0;
		int count1=0;
		int count2=0;
		int counts1=0;
		int counts2=0;
		BufferedReader br = null;
		try {
			String sCurrentLine;

			br = new BufferedReader(new FileReader("D:\\No2.java"));

			while ((sCurrentLine = br.readLine()) != null) {
				count1++;
				count2++;
				Pattern pattern1 = Pattern.compile(regexPattern1);
				Matcher matcher1 = pattern1.matcher(sCurrentLine);
				Pattern pattern2 = Pattern.compile(regexPattern2);
				Matcher matcher2 = pattern2.matcher(sCurrentLine);
				Pattern pattern3 = Pattern.compile(regexPattern3);
				Matcher matcher3 = pattern3.matcher(sCurrentLine);
				while (matcher1.find()) 
				{
					count++;
				}
				if(matcher2.find())
				{
					counts1=count1;
				}
				if(matcher3.find())
				{
					counts2=count2;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return count+counts2-counts1;

	}

	public int countLineNumber() {
		int lines = 0;
		try {
		File file = new File("D:\\No2.java");
		LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
		lineNumberReader.skip(Long.MAX_VALUE);
		lines = lineNumberReader.getLineNumber();
		lineNumberReader.close();
		} catch (FileNotFoundException e) {
		System.out.println("FileNotFoundException Occured" + e.getMessage());
		} catch (IOException e) {
		System.out.println("IOException Occured" + e.getMessage());
		}
		return lines;
	}
}
