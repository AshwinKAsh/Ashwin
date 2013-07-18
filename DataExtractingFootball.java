package Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataExtractingFootball {

	public static void main(String[] args) {

		int maxDiff = 0;
		int minDiff = 100;

		int forGoal = 0;
		int againstGoal = 0;
		String maxDiffCountry = null;
		String minDiffCountry = null;
		int differenceOfGoal = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"D:\\football.dat"));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {

				Pattern countryPattern = Pattern
						.compile("[\\d]+[\\s]+[-][\\s]+[\\d]+");
				Matcher matcher = countryPattern.matcher(sCurrentLine);

				Pattern goalPattern = Pattern.compile(".[A-Z][aA-zZ]{4,12}+");
				Matcher matcher2 = goalPattern.matcher(sCurrentLine);

				if (matcher.find() && matcher2.find()) {
					String countryName = matcher2.group();
					String var = matcher.group();
					String[] array = var.split("-");
					forGoal = Integer.valueOf(array[0].trim());
					againstGoal = Integer.valueOf(array[1].trim());
					if (forGoal > againstGoal) {
						differenceOfGoal = forGoal - againstGoal;
					} else {
						differenceOfGoal = againstGoal - forGoal;
					}
					if (differenceOfGoal > maxDiff) {
						maxDiff = differenceOfGoal;
						maxDiffCountry = countryName;
					} else if (differenceOfGoal < minDiff) {
						minDiff = differenceOfGoal;
						minDiffCountry = countryName;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" Maximum goal difference is : " + maxDiff
				+ " Of country : " + maxDiffCountry);
		System.out.println(" Maximum goal difference is : " + minDiff
				+ " Of country : " + minDiffCountry);
	}
}