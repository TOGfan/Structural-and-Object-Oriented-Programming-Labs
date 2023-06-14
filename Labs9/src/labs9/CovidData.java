package labs9;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;

public class CovidData {
	protected ArrayList<WeeklyData> allWeeks = new ArrayList<WeeklyData>();

	public CovidData() {
	}
	public void readFromFile(String fileName) throws FileFormatException {
		try {
			File file = new File(fileName);
			Scanner s = new Scanner(file);
			int counter = 0;
			while (s.hasNextLine()) {
				counter++;
				String data = s.nextLine();
				try {
					allWeeks.add(new WeeklyData(data));
				} catch (Exception ex) {
					System.out.println("Error on line "+counter+": "+ex.getMessage());
				}
			}
			s.close();
		}catch(FileNotFoundException ex) {
			throw new FileFormatException(fileName, 0, "File not found");
		}

		// insert your code here
		// the lines with errors should be rejected and suitable message should appear
		// on standard error
	}

	// for all countries and all weeks
	public int getTotalCases() {
		int totalCases=0;
		for(int i=0;i<allWeeks.size();i++) {
			totalCases = totalCases + allWeeks.get(i).getCases();
		}
		return totalCases;
	}

	// total number of cases for all countries in a continent all weeks
	public int getTotalCases(String continent) {
		int totalCases=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getContinent().equals(continent)) {
				totalCases = totalCases + allWeeks.get(i).getCases();
			}
		}
		return totalCases;
	}

	// total number of cases for all countries in the week
	public int getTotalCases(int week) {
		int totalCases=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getWeek()==week) {
				totalCases = totalCases + allWeeks.get(i).getCases();
			}
		}
		return totalCases;
	}

	// total number of cases for all countries in a continent in the week
	public int getTotalCases(String continent, int week) {
		int totalCases=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getContinent().equals(continent)&&allWeeks.get(i).getWeek()==week) {
				totalCases = totalCases + allWeeks.get(i).getCases();
			}
		}
		return totalCases;
	}

	// total number of deaths for all countries and all weeks
	public int getTotalDeaths() {
		int totalDeaths=0;
		for(int i=0;i<allWeeks.size();i++) {
			totalDeaths = totalDeaths + allWeeks.get(i).getDeaths();
		}
		return totalDeaths;
	}

	// total number of deaths for all countries in a continent all weeks
	public int getTotalDeaths(String continent) {
		int totalDeaths=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getContinent().equals(continent)) {
				totalDeaths = totalDeaths + allWeeks.get(i).getDeaths();				
			}

		}
		return totalDeaths;
	}

	// total number of deaths for all countries in the week
	public int getTotalDeaths(int week) {
		int totalDeaths=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getWeek()==week) {
				totalDeaths = totalDeaths + allWeeks.get(i).getDeaths();				
			}

		}
		return totalDeaths;
	}

	// total number of deaths for all countries in a continent in the week
	public int getTotalDeaths(String continent, int week) {
		int totalDeaths=0;
		for(int i=0;i<allWeeks.size();i++) {
			if(allWeeks.get(i).getWeek()==week&&allWeeks.get(i).getContinent().equals(continent)) {
				totalDeaths = totalDeaths + allWeeks.get(i).getDeaths();				
			}

		}
		return totalDeaths;
	}
	public void printAllData() {
		for(int i=0;i<allWeeks.size();i++) {
			System.out.println(allWeeks.get(i).toString());
		}
	}
}
