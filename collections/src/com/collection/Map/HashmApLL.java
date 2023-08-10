package com.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashmApLL {
	public static void main(String[] args) {
		Map<String, Integer> marks=new HashMap<>();
		     marks.put("Deepak", 898);
		     marks.put("Manoj", 800);
		     marks.put("Dhiru", 890);
		     marks.put("Vikas", 750);
		     marks.put("Deepak", 600);
		     
		     marks.put(null, 898);
		     marks.put(null, 909);
		     marks.put("nav", 867);
		     
		  // hashcode() --> hashing  override the method form object class it hashing is converting object type into  integer type.so we can easily access them  
		     
		     System.out.println(marks);
		     
		     System.out.println( marks.get("nav"));
		     
		     //it will check for nav -21020 then calculate index 
		     //index-12
		     // Equals to check the key name and return value 
		     
		      
		     
		
	}

}
