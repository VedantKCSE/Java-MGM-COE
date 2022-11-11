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