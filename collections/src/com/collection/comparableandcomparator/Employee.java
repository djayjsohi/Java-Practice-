package com.collection.comparableandcomparator;




public class Employee {
	 private String name;
	 private int id;
	 private int phone;


	 
	 // using comparable interface we can compare with only one variable like name, id,phone we can comapre with this only one
	
//		public int compareTo(Employee o) {
//			
//			return this.phone-o.phone;
//			
//		}

	 
	public Employee(String name, int id, int phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}


	public String getName(){
		return name;
	}


	public void setName(String name){
		this.name = name;
	}


	public int getId(){
		return id;
	}


	public void setId(int id){
		this.id = id;
	}


	public int getPhone(){
		return phone;
	}


	public void setPhone(int phone){
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", phone=" + phone + "]";
	}	 
	 
}
