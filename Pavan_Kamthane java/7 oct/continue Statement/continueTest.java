import java.util.Scanner;
class continueTest{
	public static void main(String arg[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number between 1 to 10");
		System.out.println("To us continue statement");
		int cNum = in.nextInt();	
	
		for(int i=1;i<=10;i++){
			if(i==5){
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println("Continued at " +cNum); 
	}
}