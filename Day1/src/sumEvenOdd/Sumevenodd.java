package sumEvenOdd;

import java.util.Scanner;

public class Sumevenodd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number1 :");
		int inp1=sc.nextInt();
		System.out.print("Enter number2 :");
		int inp2=sc.nextInt();
		int sum=inp1+inp2;
		if(sum%2==0) {
			System.out.println(" Sum isEVEN");
		}
		else {
			System.out.println(" Sum is ODD");
		}

	}

}