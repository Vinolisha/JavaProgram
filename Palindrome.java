import java.util.Scanner;

public class Palindrome{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp=number;
		int result=0;
		do{
			int i=temp%10;
			result=(result*10)+i;
			temp=temp/10;

		}while(temp>0);

		if (number==result)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not a palindrome");
	}
}
