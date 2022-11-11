# Assignment 2
## 1.	Explain static method and static field with suitable program.
Static Method: 
The static keyword is used to construct methods that will exist regardless of whether or not any instances of the class are generated. Any method that uses the static keyword is referred to as a static method.

Static Field: 
Fields that have the static modifier in their declaration are called static fields or class variables. They are associated with the class, rather than with any object. Every instance of the class shares a class variable, which is in one fixed location in memory.

Example:
```java
  class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
 
  System.out.println(result);  
  }  
}

```
## 2.	What is an array? Explain the program of an array.
An array is a collection of items of same data type stored at contiguous memory locations. 
This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array). The base value is index 0 and the difference between the two indexes is the offset.
```java
  class array
{
	public static void main (String[] args)
	{
	
	// Creating an integer array
	// named arr of size 10.
	int[] arr = new int[10];
	
	// accessing element at 0 index
	// and setting its value to 5.
	arr[0] = 5;
	
	// access and print value at 0
	// index we get the output as 5.
	System.out.println(arr[0]);
		
	}
}
```
## 3. Explain Enhanced for loop and implement Write an application that uses an enhanced for statement to sum the double values passed by the command-line arguments.?
- Enhanced for statement iterates through the elements of an array without using a counter
- Thus avoiding the possibility of “stepping outside” the array.
- Syntax:
```java
  for (parameter : arrayName)
          statement
```
- where parameter has a type and an identifier (e.g., int number), and arrayName is the array through which to iterate.
- The type of the parameter must be consistent with the type of the elements in the array.
Eg:
```java
public class EnhancedForTest {
  public static void main(String[] args) {
  int[] a = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
  int total = 0;
  for(int num : a)
  total += num;
  System.out.printf("Total of array elements: %d\n", total);
  }
}

//Output:
//Total of array elements:  849
```
## 4. Explain how to pass arrays to a method and develop a program for this concept.?
You can pass arrays to a method just like normal variables. When we pass an array to a method as an argument, actually the address of the array in the memory is passed (reference). Therefore, any changes to this array in the method will affect the array.
Suppose we have two methods min() and max() which accepts an array and these methods calculates the minimum and maximum values of the given array respectively:
```java
import java.util.Scanner;
public class ArraysToMethod {
   public int max(int [] array) {
      int max = 0;
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }

   public int min(int [] array) {
      int min = array[0];
   
      for(int i = 0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
      ArraysToMethod m = new ArraysToMethod();
      System.out.println("Maximum value in the array is::"+m.max(myArray));
      System.out.println("Minimum value in the array is::"+m.min(myArray));
   }
}
```
## 5. Discuss multidimensional arrays.
A multi-dimensional array can be termed as an array of arrays that stores homogeneous data in tabular form. Data in multidimensional arrays are stored in row-major order.
Syntax:
```java
  data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];
```
where:
data_type: Type of data to be stored in the array. For example: int, char, etc.
dimension: The dimension of the array created. For example: 1D, 2D, etc.
array_name: Name of the array
size1, size2, …, sizeN: Sizes of the dimensions respectively.
Examples:
```java
//Two dimensional array:
int[][] twoD_arr = new int[10][20];

//Three dimensional array:
int[][][] threeD_arr = new int[10][20][30];
```
Size of multidimensional arrays: The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions. 

For example: 
The array int[][] x = new int[10][20] can store a total of (10*20) = 200 elements. 
Similarly, array int[][][] x = new int[5][10][20] can store a total of (5*10*20) = 1000 elements.

## 6. Explain variable-length argument list ?
- With variable-length argument lists, you can create methods that receive an unspecified number of arguments.
- A type followed by an ellipsis (...) in a method’s parameter list indicates that the method receives a variable number of arguments of that particular type.
- This can occur only once in a parameter list, and the ellipsis, with its type, must be placed at the end of the parameter list.
- While you can use method overloading and array passing to accomplish much of what is accomplished with variable length argument lists, using an ellipsis in a method’s parameter list is more concise.

## 7. Implement a program for command line argument. ?
```java
public class CommmandLine1 {
  public static void main(String[ ] args) {
  for(int counter = 0; counter < args.length; counter++ )
  System.out.println(args[counter]);
  }
}
```
## 8. Explain break and continue Statement with suitable example.
Break Statement:
- when break statement executed causes immediate exit from that statement/code block.
- Common uses of the break statement are to escape early from a loop or to skip the remainder of a switch.

```java
public class BreakTest {
	public static void main (String[] mohsin) {
		int count; 
		for (count = 1; count <= 10; count++) {
			if (count == 5)
			break;
		System.out.print (count + “ “);
	}
	System.out.println ("Broke out of loop at count= “ +count);
}
```
Continue Statement:
when continue statement executed in a while, for or do…while, skips the remaining statements in the loop body and proceeds with the next iteration of the loop.
```java
public class ContinueTest {
	public static void main (String[]  mohsin) {
		for (int count = 1; count <= 10; count++) {
			if (count == 5)
			continue;
			System.out.print(count + " ");
		} 
	System.out.println("\nUsed continue to skip printing 5" );
	}
}
```
## 9. What is the difference between pre-increment, post-increment, pre-decrement and postdecrement a variable? Write different Java statements that each add (for increment) and subtract (for decrement) 1 to integer variable x.
![Screenshot (20)](https://user-images.githubusercontent.com/98043938/201393746-3f9adfbf-430d-4655-a5fd-06af09228627.png)
```java
public class Increment {
  public static void main( String[] args ) {
	int c = 5;
	System.out.println( c );
	System.out.println( c++ );
	System.out.println( c );
	System.out.println();
	c = 5;
	System.out.println( c );
	System.out.println( ++c );
	System.out.println( c );
  }
}

```

## 10. Write a Java application that calculates and prints the table of 5. Use a while loop.
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
```
## 11. Implement the following integer methods:
- Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation: fahrenheit = 9.0 / 5.0 * celsius + 32
```java
import java.util.Scanner;
class CelsiustoFahrenheit
{
	double fahrenheit(double c)
	{	
	return  ((9*c)/5)+32;
	}
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Celsius temperature");
                   a=sc.nextDouble();
	    CelsiustoFahrenheit cel=new CelsiustoFahrenheit( );
	    double result=cel.fahrenheit(a);	
	    System.out.println("Fahrenheit temperature is = "+result);		  	  	     
	} 	
}
```
- Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation: celsius = 5.0 / 9.0 * ( fahrenheit - 32 )
```java
import java.util.Scanner;
class FahrenheittoCelsius
{
	double celsius(double f)
	{	
	return  5.0 / 9.0 * ( f - 32 );
	}
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble();
	    FahrenheittoCelsius cel=new FahrenheittoCelsius( );
	    double result=cel.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	
}
```

## 12. (Distance Between Points) Write method distance to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate this method into an application that enables the user to enter the coordinates of the points.
```java
class DistanceBwPoint
{
	public static void main(String arg[])
	{
             	 int x1,x2,y1,y2;
	         double dis;
	         Scanner sc=new Scanner(System.in);
	         System.out.println("enter x1 point");
                 x1=sc.nextInt();
                 System.out.println("enter y1 point");
                 y1=sc.nextInt();
	         System.out.println("enter x2point");
                 x2=sc.nextInt();
	         System.out.println("enter y2 point");
                 y2=sc.nextInt();
		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}
```
## 13. Write a java array program to display following pattern.
```java
import java.util.Scanner;

public class display{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int rows = sc.nextInt();       
       for (int i= 0; i<= rows-1 ; i++){
           for (int j=0; j<=i; j++){
           	System.out.print("*"+ " ");
           }
           System.out.println("");
	}
        for (int i=rows-1; i>=0; i--)
       {
           for(int j=0; j <= i-1;j++)
           {
               System.out.print("*"+ " ");
           }
           System.out.println("");
       }
       sc.close();
   }
}
```
