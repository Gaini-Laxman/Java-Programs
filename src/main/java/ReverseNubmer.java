import java.util.Scanner;

public class ReverseNubmer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();// 123
		printNumberInReverseOrder(num);// 123
		scanner.close();

	}

	public static void printNumberInReverseOrder(int num) {// 123

		while (num != 0) {// 0!=0
			System.out.print(num % 10);
			num /= 10;// num=0
		}

	}

}
