import java.util.Scanner;

public class SamplePattern5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input ..");
		// Step1: Read the N as a integer
		int N = scanner.nextInt();// N=5
		int M = scanner.nextInt();// M=5
		printPattern1(N, M);
		scanner.close();
	}

	private static void printPattern1(int N, int M) {//N=5 M=5
		int printN = 1;
		for (int i = 1; i <= N; i++) {//i=2
			
			for (int j = 1; j <= M; j++) {//i=2 ,j=2
				System.out.print(printN+" ");//1 2 3 4 5
				printN++;//7                   6
			}//close inner loop
			System.out.println();
		}//close outer loop

	}
}
