class CalculateAmount{
	public static void main(String arg[]){
		double p=1000.0,rate=0.05,amt;
		System.out.printf("%s%20s\n","year","Amount on diposit");
		for(int year = 1;year<=10;year++){
			amt = p*Math.pow(1+rate,year);
			System.out.format("%4d%20.2f\n",year,amt);
		}
	}	
}