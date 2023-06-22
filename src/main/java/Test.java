import java.util.Scanner;

public class Test {

	public static int luckyNumber(int num) {
		
		if (num == 0)
			return 0;
		else if (num < 0)
			return -1;
		else if (num > 1000)
			return -2;
		else {
			int sum, rem, count;
			sum = 0;
			count = 0;
			while (num != 0) {// 0!=0
				rem = num % 10;// rem=1
				sum = sum + rem;// sum=6
				num = num / 10;// num=0
				count++;
			}
			System.out.println("no of iteration:"+count);
			return sum;
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases=scanner.nextInt();
		
		while(noOfTestCases!=0) {
			int number = scanner.nextInt();
			System.out.println(luckyNumber(number));
			noOfTestCases--;
		}
		
		scanner.close();
	}
}