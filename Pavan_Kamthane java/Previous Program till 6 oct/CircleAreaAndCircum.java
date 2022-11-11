import java.util.Scanner;
class Circle{
	public double area( double radius){
		return (3.14 * radius *radius);
	}
	public double circumference(double radius){
		return (2*(3.14)*radius);
	}
}

class CircleAreaAndCircum{
	public static void main(String arg[]){
		Scanner scanme = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = scanme.nextDouble();
		Circle myCircle = new Circle();
		System.out.println("Area ="+ myCircle.area(radius));
		System.out.println("Circumferance="+ myCircle.circumference(radius));
	}
}