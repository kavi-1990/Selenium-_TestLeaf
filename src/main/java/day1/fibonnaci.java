package day1;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=1;
		int c=0;
		
		while(c<100)
		{
			
			a=b;
			b=c;
			c=a+b;
			//System.out.println(c);
		if(c>100)
		break;
		
		System.out.println(c);
		
	}

	}}
