class Scope{
	public static int x=1;
	
	public static void main(String arg[]){
		int x =5;
		System.out.println(x);
		usedLocalVar();
		usedField();
		usedLocalVar();
		usedField();
		System.out.println("Local x in main is "+x);
	}
	
	public static void usedLocalVar(){
		int x = 25;
		System.out.println("x on entering uselocalvar method " + x);
		++x;
		System.out.println("x before exiting  uselocalvar " + x);
	}
	
	public static void usedField(){	
		System.out.println("x on entering useField method " + x);
		x*=10;
		System.out.println("x before exiting  useField " + x);
	}
}