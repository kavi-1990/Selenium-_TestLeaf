package week3day2;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	String Str="Kavitha";
	
	char[] a=Str.toCharArray();
	
	Map<Character,Integer> M1=new HashMap<Character, Integer>();
	
	for(int i=0;i<a.length;i++)
	{
	    
		if(M1.containsKey(a[i]))	
	
			
		{
			
			M1.put(a[i], M1.get(a[i])+1);
			
			
			
		}
		
		
		else
		{
			
			M1.put(a[i],1);
			
			
		}
		
		
	}
	
	
	
	System.out.println(M1);
	
	
	
	
	}

}
