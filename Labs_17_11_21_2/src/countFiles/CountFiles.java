package countFiles;
import java.io.File;
public class CountFiles {

	public static Long getFileSize(File dirDirectory) {
		Long lngSize = new Long(0);
		for (File filItem : dirDirectory.listFiles()) {
			if (filItem.isDirectory()) {
				lngSize += getFileSize(filItem);
			}
			else {
				lngSize += filItem.length();
			}
		}
		return lngSize;
	}
	File startFolder=new File(path);
	size=getFileSize(startFolder);
	System.out.print("all files contain:\t"+size+" bytes\n");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
