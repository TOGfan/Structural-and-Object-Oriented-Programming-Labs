package labs9;

public class Labs9 {

	public static void main(String[] args) {
		CovidData test = new CovidData();
		try {
			test.readFromFile("ecdc_covid19_cases.csv");
		}
		catch(FileFormatException ex) {
			System.out.println(ex.getFileName()+" "+ex.getLineNo()+" "+ex.getInfo());
		}
		//test.printAllData();
		System.out.println(test.getTotalCases(1));
		System.out.println(test.getTotalCases("Asia", 40));
		System.out.println(test.getTotalDeaths(10));
		System.out.println(test.getTotalDeaths("Africa"));
		ErrorFinder.findErrors();
	}
}
