package day1;

public class Stringfunction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

				  
		  String name="testleaf(1002)";
		 	
	  //System.out.println(name.substring(9, 13));
	  
	  System.out.println(name.replaceAll("\\D",""));
	
		String Msg="Hihowareyou";
		
		char[] charArray=Msg.toCharArray();// First convert String to character
		
		
		// Conversion of String to Character in Reverse order 
		   for (int i=charArray.length-1;i>=0;i--)
		   {
			   
			   System.out.print(charArray[i]);
		   }
		
		
	
		   
		   // To pick up each word:
		   
		   String splitmsg="Hi How do u do";
		   
		   String[] split = splitmsg.split("");
		   
		   
	
		   
		   
		   
		
		
		/*
		 * // To pick each character from character array
		 * 
		 * for (int i=0;i<charArray.length;i++) {
		 * 
		 * System.out.print(charArray[i]);
		 * 
		 * }
		 */
		
		
	
	
	
	
	
	}

}
