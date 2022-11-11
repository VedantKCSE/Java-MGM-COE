import java.util.Scanner;

class Findmax{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int largest = -1;
		for(int i =1;i<=10;i++){
			System.out.println("Enetr " +i + "th number ");
			int num =sc.nextInt();
			if(num > largest){
				largest = num;
			}
		}
		System.out.println("Largest : "+ largest);
	}
}