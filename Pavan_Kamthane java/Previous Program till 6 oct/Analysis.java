import java.util.Scanner;
public class Analysis{
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int passes=0,failure=0,studentCounter=1,result;
		while(studentCounter<=10){
			System.out.println("Enter the result, 1= pass and 2 = fail " );
			result = in.nextInt();
			if(result == 1 ){
				passes++;
			}
			else{
				failure--;
			}
			
			studentCounter++;
		}
		System.out.println(passes + "Are Passed"+failure + " are fail");
		if(passes >10){
			System.out.println("Bonus to instructor");
		}
	}
}