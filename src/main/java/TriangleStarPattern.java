import java.util.Scanner;

public class TriangleStarPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input ..");
		// Step1: Read the N as a integer
		int N = scanner.nextInt();// N=5
		printPattern1(N);
		scanner.close();
	}

	private static void printPattern1(int N) {//N=5
 
		for (int i = 1; i <= N; i++) {// 
			
			for (int j = 1; j <= i; j++) {// 
				//System.out.print(j+" ");// 
				System.out.print("* ");
			}//close inner loop
			System.out.println();
		}//close outer loop

	}
}
