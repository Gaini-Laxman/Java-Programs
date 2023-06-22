import java.util.Scanner;

public class FactorialProblem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Step1: Read the N as a integer
		System.out.println("Enter Input ..");
		int N = scanner.nextInt();
		
		
		long result = factorialOfN(N);
		System.out.printf("%d", result);
		scanner.close();
	}

	private static long factorialOfN(int n) {//3
		//write the logic to find factorial of given number
		long factorial=1;
		long sum=0;
		for(int i=n;i>=1;i--){//0>=1
		      // sum = factorial*i;
		       factorial=factorial*i;//factorial=6;
		}
		return factorial;//6
	}


}
