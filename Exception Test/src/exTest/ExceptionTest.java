package exTest;
import java.util.Scanner;
public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String token = sc.next();
			try {
				int number = Integer.parseInt(token);
				System.out.println(number);
			}
			catch(Exception ex) {
				System.out.println("sorry trash");
			}
		}
		sc.close();
	}
}
