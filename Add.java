import java.util.Scanner;
class Main{
	public static void main (String[] args){
		int a;
		int b;
		int total;
		Scanner input=new Scanner(System.in);
		System.out.println("enter one num:");
		a=input.nextInt();
		System.out.println("enter another number:");
		b=input.nextInt();
		total=a+b;
		System.out.println("the result is"+total);
	}
}

