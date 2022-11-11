import java.util.Scanner;

class Tabular{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		System.out.printf("N\t10*N\t100*N\t1000*N\n");
		for(int i =1;i<=5;i++){
			int b =i*10;
			int c = i*100;
			int d = i*1000;
			System.out.printf(i + "\t" + b + "\t" + c + "\t" +d ); 
		}
	}
}