package labs9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorFinder {

	public static void main(String[] args) {
		Pattern pt;
		pt = Pattern.compile("(\\d*)()");
		Scanner fileScan = null;
		try {
			fileScan = new Scanner(new File("ecdc_covid19_cases.csv"));
			int counter = 0;
			while (fileScan.hasNextLine()) {
				counter++;
				String oneLine = fileScan.nextLine();
				Matcher mt = pt.matcher(oneLine);
				while (mt.find()) {
					for (int k=0; k<=mt.groupCount(); k++)
						System.out.println(mt.group(k));
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
