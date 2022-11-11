import java.util.Scanner;
class Star4{
	public static void main(String arg[]){
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0 ; i<n;i++){
			for(int j =0;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}	
		for(int i = 0 ; i<n;i++){
			for(int j =n-2;j>=i;j--){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}