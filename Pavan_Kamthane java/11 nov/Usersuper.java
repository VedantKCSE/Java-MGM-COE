class A{
	int i;
}

class B extends A{
	int i;
	B(int a,int b){
		super.i = a;
		i = b ;
	}
	void show(){
		System.out.println(" superclass i : " + super.i);
		System.out.println(" subclass i : " + i);
	}
}

class Usersuper{
	public static void main(String pavan[]){
		B subOb = new B(1,2);
		subOb.show();
	} 
}