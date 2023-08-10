package com.collection.Map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class ContractTest {
	public static void main(String[] args) {
		
	
     EmployeeKey ek1=new EmployeeKey("101", "1192195" );
     EmployeeKey ek2=new EmployeeKey("102", "1192196");
     EmployeeKey ek3=new EmployeeKey("103", "1192197");
     EmployeeKey ek4=new EmployeeKey("104", "1192198");
     EmployeeKey ek5=new EmployeeKey("105", "1192190");
     
      
     Set<EmployeeKey> set=new HashSet<>();
     set.add(ek1);
     set.add(ek2);
     set.add(ek3);
     set.add(ek4);
     set.add(ek5);
     System.out.println(set);
     
}

}
class EmployeeKey{
	String empid;
	String dob;
	
	public EmployeeKey(String theid, String thedob ) {
		empid= theid;
		dob=thedob;
	}
	
	

	@Override
	public String toString() {
		return "EmployeeKey [empid=" + empid + ", dob=" + dob + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(dob, empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(empid, other.empid);
	}
	
	
}