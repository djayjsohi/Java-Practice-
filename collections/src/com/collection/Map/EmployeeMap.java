package com.collection.Map;

public class EmployeeMap
{
	private Integer id;
	private String firstname;
	private String lastName;
	
	
	
	public boolean equals(Object o) {
		if(o == null)
		{
			return false;
		}
		if (o == this)
		{
			return true;
		}
		if (getClass() != o.getClass())
		{
			return false;
		}

		EmployeeMap e = (EmployeeMap) o;
		return (this.getId() == e.getId());
	}
	
	@Override
	public int hashCode()
	{
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}