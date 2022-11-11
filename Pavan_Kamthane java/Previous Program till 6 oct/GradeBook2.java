import java.util.Scanner;
class GradeBook{
 	private String CourseName;

	public void GradeBook(String name)
	{
		CourseName=name;
	}	

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

	public void determineClassAvg(){
		Scanner in = new Scanner (System.in);
		int total,gradeCounter,grade,avg;
		total=0;
		gradeCounter=1;
		while(gradeCounter<=10){
			grade=in.nextInt();
			total +=grade;
			gradeCounter++;
		}
		avg=total/10;
		System.out.println("Total="+total);
		System.out.println("Avg="+avg);
	}
}


public class GradeBook2{
	public static void main(String args[])
	{
		String BookName= "Bhagwat Gita";
		GradeBook myGradeBook=new GradeBook(BookName);
		myGradeBook.displayMessage();
		myGradeBook.determineClassAvg();
	}
}

