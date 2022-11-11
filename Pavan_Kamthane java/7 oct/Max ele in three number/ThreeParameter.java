import java.util.Scanner;

class ThreeParameter{
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1= in.nextInt();	
		System.out.println("Enter Second number");
		int num2= in.nextInt();	
		System.out.println("Enter Third number");
		int num3= in.nextInt();		

		int result = maxEle(num1,num2,num3);
		System.out.println("Max ele is : " + result);
					
		System.out.println("Max ele using Math.max function: " + Math.max(num1,Math.max(num2,num3)));
	}
	
	public static int maxEle(int x,int y,int z){
		int maxVal = x;
		if(y> maxVal){
			maxVal=y;
		}
		
		if(z> maxVal){
			maxVal= z;
		}
		return maxVal;		
	}


		
}