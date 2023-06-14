package labs9;

public class FileFormatException extends Exception {
	private static final long serialVersionUID = 1L;
	protected int lineNumber;
	protected String info; // error desc. and not proper data
	protected String fileName;

	public FileFormatException(String fileName, int lineNo, String info) {
		// insert your code here
		// accept all parameters without checking
		this.fileName = fileName;
		this.lineNumber = lineNo;
		this.info = info;
	}

	public int getLineNo() {
		return lineNumber;
	}

	public String getInfo() {
		return info;
	}

	public String getFileName() {
		return fileName;
	}
}
