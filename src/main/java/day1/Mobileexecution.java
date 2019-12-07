package day1;

public class Mobileexecution {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

	
	Mobile M=new Mobile();
	
	

	System.out.println(M.isnotificationreceived);
	
	
	
	float version=M.version;
	
	System.out.println(version);
	
	String Mobilename= M.Mobilename;
	
		
	System.out.println(Mobilename);
	
	M.takepic();
	
    String msg=M.sendmsg();
    
    System.out.println(msg);
    
    int callnum=M.callnum();// value without arguments.
    
    System.out.println(callnum);
    
    
    int callingnum=M.callingnum(56);// passing arguments.
    System.out.println(callingnum);
	
	}

}
