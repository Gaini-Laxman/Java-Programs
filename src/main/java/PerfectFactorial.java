import java.util.Scanner;

public class PerfectFactorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input ..");
		// Step1: Read the N as a integer
		int N = scanner.nextInt();//N=145
		 if(isStrongNumberOrNot(N))
			 System.out.println("YES");
		 else
			 System.out.println("NO");
		scanner.close();
	}

	private static boolean isStrongNumberOrNot(int n) {//n=145
		 int rem=0,t=n;//rem=0,t=145
		 long sum=0;//sum=0
		 while(n!=0) {//0!=0
			 rem=n%10;//rem=1
			 sum = sum+ factorialOfN(rem);//sum=145
			 n/=10;//n=0
		 }
		return (t==sum);//145==145
	}

	private static long factorialOfN(int n) {// 5
		// write the logic to find factorial of given number
		long factorial = 1;
		long sum = 0;
		for (int i = n; i >= 1; i--) {// 0>=1
			// sum = factorial*i;
			factorial = factorial * i;// factorial=6;
		}
		return factorial;// 120
	}

}
