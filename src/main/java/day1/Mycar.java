package day1;

public class Mycar {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		
		Car C= new Car();
		
		 String carname= C.carname;
		
		System.out.println(carname);
		
		
		int carnum=C.carnum;
		
		System.out.println(carnum);
		
		
		//boolean ispunchured=C.ispunchured;
		//System.out.println(ispunchured);
		
		System.out.println(C.ispunchured);
		
	    C.maxspeed();
		
		System.out.println(C.maxspeed());
		
		
		C.isengineon();
		
		System.out.println(C.isengineon());
		
	double airpressure=C.airpressure(20000.000);
	System.out.println(airpressure);
		
		
		
		
		
		
		
		
		
	}

}
