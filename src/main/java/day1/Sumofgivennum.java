package day1;

public class Sumofgivennum {

	static int getSumofnum(int n)
	{
		
		int sum;
		
		for (sum=0;n>0;sum+=n%10,n/=10); 
		{
			
			return sum;
			

			
		}
		
				
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * String name="AC1SFc45c2";
		 * 
		 * 
		 * System.out.println(name.replaceAll("\\D",""));
		 */
		
		
		int n=1452;
		System.out.println(getSumofnum(n));
		
	}

}
