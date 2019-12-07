package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Listduplicatevalue {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		  java.util.List<String> lstname=new ArrayList<String>();
		  
		  lstname.add("kavitha"); 
		  lstname.add("Suganya"); 
		  lstname.add("Suganya");
		   
	 //To get all element in list 
		  
	 for(int i=0;i<lstname.size();i++)
	 
	 {
		  
		//String a=  System.out.println(lstname.get(i));
		 
		 String a="";// list data store
		 
		 
		 a=lstname.get(i);
		 
		 
		 int count=0;
		 
		 for(int j=0;j<lstname.size();j++)
			 
			 if(a==lstname.get(j))// chking j value
				 
				 
				 
			 {
				 
				 count++;
			 }
		  
	 
		 
	
	 if(count>1)
		 
	 {
		 
		 System.out.println("duplicate print"+lstname.get(i));// chking a with i
	 }}
	 
	 Set<String> s1=new LinkedHashSet<String>();
	s1.add("kavitha");
	s1.add("Suganya");
	s1.add("Suganya");
	s1.add("vidhya");
	s1.add("Adithi");
	
	 
	
	
	for( String each:s1)
		
	{
		
		System.out.println(each);
	}
	
	}

}
