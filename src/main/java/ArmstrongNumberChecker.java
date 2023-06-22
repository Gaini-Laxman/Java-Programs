import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static int getNoOfDigits(int num) {
		// write the logic here to find the no of digits
		int count=0;//count=0
		while(num>0) {//0>0
			num/=10;//num=0
			count++;//count=2
		}
		return count;//2
	}
	@SuppressWarnings("unused")
	public static boolean isArmstrongOrNot(int num) {
		// write the logic here to find the Armstrong or not
		//invoke the method i.e. getNoOfDigits by passing a number
		int n = getNoOfDigits(num);
		int temp=num;
		//num=153 , noOfDigits=3
		int lastDigit=0;
		int result = 0;
		while(num!=0) {//0!=0
			lastDigit = num%10;//lastDigit=1
			//code here
			 result+=findPow(lastDigit, n);//result=153
			//update the num by dividing 10
			num/=10;//num=0
		}
		return (temp==result)?true:false;
	}
	
	public static int findPow(int base,int exp)
	{
		int result = 1;
		for(int i=1;i<=exp;i++) {
			 result*=base;
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean result = isArmstrongOrNot(num);
		System.out.println(result);
		scanner.close();

	}

}
