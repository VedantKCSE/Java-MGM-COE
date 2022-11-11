import java.util.Scanner;
class addition
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,sum;
System.out.print("Enter the first number");
num1=sc.nextInt();
System.out.print("Enter the second number");
num2=sc.nextInt();
sum=num1+num2;
System.out.print("The addition of two numbers is "+sum);
}
}