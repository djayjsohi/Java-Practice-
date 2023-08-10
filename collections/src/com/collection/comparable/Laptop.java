package com.collection.comparable;



public class Laptop implements Comparable<Laptop>  {
	
	String company;
	int id;
	int modelName;
	
	
	 
	 // using comparable interface we can compare with only one variable like name, id,phone we can comapre with this only one
	
//


	@Override
	public int compareTo(Laptop o) {
		
		  return this.id-o.id; //itwill print in asending order
		  
	}
	
	
	
	public Laptop(String company, int id, int modelName) {
		super();
		this.company = company;
		this.id = id;
		this.modelName = modelName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModelName() {
		return modelName;
	}
	public void setModelName(int modelName) {
		this.modelName = modelName;
	}



	@Override
	public String toString() {
		return "Laptop [company=" + company + ", id=" + id + ", modelName=" + modelName + "]";
	}



	

	
}
