import java.util.Scanner;
class GradeBook{
 	private String CourseName;
	public void setCourceName(String name)
	{
		CourseName=name;
	}
	public String getCourseName()
	{
		return CourseName;
	}

	public void displayMessage(){
		System.out.printf("Welcome to the grade book for %s!",getCourseName());
	}
}


public class GradeBookTest{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		GradeBook myGradeBook=new GradeBook();
		System.out.print("initial course name is :9 \n\n"+myGradeBook.getCourseName());
		System.out.print("please enter the course name");
		String theName=sc.nextLine();
		myGradeBook.setCourceName(theName);
		System.out.println();
		myGradeBook.displayMessage();
	}
}

