package day1;

public class Primenumber {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		
		int i,j;
		int s;
		
		for(  i=2;i<=100;i++)
		{
			
			s=0;
			for(j=2;j<i;j++)
				
			{
				
				if(i%j==0)
					
					s=1; 
				break;
				
				
		    }
			
		
		
		if(s==0)
				
				System.out.println(i);
			
				
		}
		
}
}