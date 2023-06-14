package labs9;

public class WeeklyData {
	private Integer year;
	private Integer week;
	private Integer cases;
	private Integer deaths;
	private String country;
	private String continent;
	private Double rate;

	public WeeklyData(String line) throws Exception {
		String data[] = line.split(",");
		if (data.length != 10) {
			throw new Exception("Invalid input length: " + line);
		}
		if (data[0].length() != 10) {
			throw new Exception("Invalid date length: " + data[0]);
		}
		try {
			year = Integer.valueOf(data[0].substring(6, 10));
		} catch (Exception ex) {
			throw new Exception("Invalid year: " + data[0].substring(6, 10));
		}
		if (data[1].length() != 7) {
			throw new Exception("Invalid week length: " + data[1]);
		}
		try {
			week = Integer.valueOf(data[1].substring(5, 7));
		} catch (Exception ex) {
			throw new Exception("Invalid week: " + data[1].substring(5, 7));
		}
		try {
			cases = Integer.valueOf(data[2]);
		} catch (Exception ex) {
			throw new Exception("Invalid number of cases: " + data[2]);
		}
		try {
			deaths = Integer.valueOf(data[3]);
		} catch (Exception ex) {
			throw new Exception("Invalid number of deaths: " + data[3]);
		}
		country = data[4];
		continent = data[8];
		try {
			rate = Double.valueOf(data[9]);
		} catch (Exception ex) {
			throw new Exception("Invalid rate: " + data[9]);
		}
	}

	public Integer getYear() {
		return year;
	}

	public Integer getWeek() {
		return week;
	}

	public Integer getCases() {
		return cases;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public String getCountry() {
		return country;
	}

	public String getContinent() {
		return continent;
	}

	public Double getRate() {
		return rate;
	}

	public String toString() {
		return "" + year + " " + week + " " + cases + " " + deaths + " " + country + " " + continent + " " + rate;
	}

	public boolean equals(Object Ob) {
		if (!(Ob instanceof WeeklyData))
			return false;
		if (((WeeklyData) Ob).getYear() != this.year) {
			return false;			
		}
		if (((WeeklyData) Ob).getWeek() != this.week) {
			return false;			
		}
		if (((WeeklyData) Ob).getCases() != this.cases) {
			return false;			
		}
		if (((WeeklyData) Ob).getDeaths() != this.deaths) {
			return false;			
		}
		if (((WeeklyData) Ob).getCountry() != this.country) {
			return false;			
		}
		if (((WeeklyData) Ob).getContinent() != this.continent) {
			return false;			
		}
		if (((WeeklyData) Ob).getRate() != this.rate) {
			return false;			
		}
		return true;
	}
}
