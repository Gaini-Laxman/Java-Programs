import java.util.Scanner;

public class DivisibilityChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean b = isDivisibleNumber(num);
		System.out.println(b ? "Yes" : "No");
		scanner.close();

	}

	public static boolean isDivisibleNumber(int num) {
		return (num % 5 == 0) && (num % 11 == 0);
	}

}
