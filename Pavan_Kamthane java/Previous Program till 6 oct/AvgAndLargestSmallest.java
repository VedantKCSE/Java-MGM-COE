import java.util.Scanner;


class AvgAndLargestSmallest{
	public static void main(String Arg[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=in.nextInt();
		System.out.println("Enter the Second Number");
		int num2=in.nextInt();
		System.out.println("Enter the Third Number");
		int num3=in.nextInt();
		
			
		System.out.println( " Addition is  "  + (num1+num2));
		
		if(num1>num2 && num1>num3){
			System.out.println(num1+ " is Greater");
		}else if(num2>num1 && num2>num3){
			System.out.println(num1+ " is Greater  ");
		}else if(num3>num1 && num3>num2){
			System.out.println(num1+ " is Greater  ");
		}

		if(num1<num2 && num1<num3){
			System.out.println(num1+ " is Smallest");
		}else if(num2<num1 && num2<num3){
			System.out.println(num1+ " is Smallest  ");
		}else if(num3<num1 && num3<num2){
			System.out.println(num1+ " is Smallest  ");
		}

		System.out.println( " Avarage is  "  + ((num1+num2+num3)/3));
		
	}
}