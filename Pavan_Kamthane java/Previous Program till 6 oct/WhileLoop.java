class WhileLoop{
	public static void main(String Pavan[]){
		System.out.println("First Loop called");
		firstLoop();
		System.out.println();

		System.out.println("Second Loop called");
		secondLoop();
		System.out.println();

		System.out.println("Third Loop called");
		System.out.println("Third Loop is going infinite time hence we are not calling");
		//thirdLoop();
		System.out.println();
		
		System.out.println("Fourth Loop called");
		fourthLoop();
		System.out.println();

		System.out.println("Fifth Loop called");
		fifthLoop();
		System.out.println();


		System.out.println("Sixth Loop called");
		sixthLoop();
		System.out.println();

		System.out.println("Seventh Loop called");
		System.out.println("Seventh Loop is going infinite time hence we are not calling");
		//seventhLoop();
		System.out.println();
		

			
	}

	static void firstLoop(){
		int i=1;
		while(i<=10){
			System.out.print(i + " ");
			i++;
		}
	}

	
	static void secondLoop(){
		System.out.println("Instance variable initilize as 1  while loop only work if i = 10 , This will not happen");
		int i=1;
		while(i>=10){
			System.out.print(i + " ");
			i++;
		}
	}

	static void thirdLoop(){
		int i=1;
		System.out.println("This loop will goes in infinite loop bcoz i-- will continuously goes decreasing.");
		System.out.println("to stop infinite loop press cntrl + C OK!!!!!");
		while(i<=10){
			System.out.print(i + " ");
			i--;
		}
	}

	static void fourthLoop(){
		System.out.println("Here i-- is start decreasing from 1 and while loop need i>10 means no output");
		int i=1;
		while(i>=10){
			System.out.print(i + " ");
			i--;
		}
	}

	static void fifthLoop(){
		int i=1;
		System.out.println("Here 10 will not come bcoz equal size is removed");
		while(i<10){
			System.out.print(i + " ");
			i++;
		}
	}

	static void sixthLoop(){
		int i=1;
		System.out.println("Instance variable initilize as 1  while loop only work if i > 10 , Means No output");
		while(i>10){
			System.out.print(i + " ");
			i++;
		}
	}

	static void seventhLoop(){
		int i=1;
		System.out.println("This loop will goes in infinite loop bcoz i-- will continuously goes decreasing.");
		System.out.println("to stop infinite loop press cntrl + C OK!!!!!");
		while(i<10){
			System.out.print(i + " ");
			i--;
		}
	}

	
}