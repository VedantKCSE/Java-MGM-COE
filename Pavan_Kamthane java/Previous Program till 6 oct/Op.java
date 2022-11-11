import java.util.Scanner;


class Op{
	public static void main(String Arg[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=in.nextInt();
		System.out.println("Enter the First Number");
		int num2=in.nextInt();

		
			
		System.out.println(num1 + " + " + num2 +"=" + (num1+num2));
		System.out.println(num1 + " - " + num2 +"=" + (num1-num2));
		System.out.println(num1 + " * " + num2 +"=" + (num1*num2));
		System.out.println(num1 + " / " + num2 +"=" + (num1/num2));
		System.out.println(num1 + " % " + num2 +"=" + (num1%num2));
				
	}
}