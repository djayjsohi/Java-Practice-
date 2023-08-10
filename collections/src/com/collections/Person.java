package com.collections;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private String address;
	private boolean isMarried;
	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}
	

@Override public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false; 
	if (getClass() != obj.getClass()) return false; 
	Person other = (Person) obj; 
	return Objects.equals(address,
					other.address) && age == other.age && Objects.equals(name, other.name); }
}
