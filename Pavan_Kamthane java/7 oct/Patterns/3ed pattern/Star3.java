import java.util.Scanner;
class Star3{
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Enter the number of rows");
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}