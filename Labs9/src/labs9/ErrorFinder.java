package labs9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;
*/
public class ErrorFinder {

	public static void findErrors() {
//		Pattern pt;
//		pt = Pattern.compile("\\d*\\d*\\d*");
		Scanner fileScan = null;
		try {
			fileScan = new Scanner(new File("ecdc_covid19_cases.csv"));
			int counter = 0;
			while (fileScan.hasNextLine()) {
				counter++;
				String oneLine = fileScan.nextLine();
/*				Matcher mt = pt.matcher(oneLine);
				while (mt.find()) {
					for (int k=0; k<=mt.groupCount(); k++)
						System.out.println(mt.group(k));
				}
*/			
				try {
					new WeeklyData(oneLine);
				}catch(Exception ex) {
					System.out.println("Error on line "+counter+": "+ex.getMessage());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// handle the exception here
			System.out.println("File not found..");
		}
		if (fileScan != null)
			fileScan.close();

	}
}
