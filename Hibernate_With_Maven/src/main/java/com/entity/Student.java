package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private int id ;
	private String Name;
	private String City;
	
	public Student(){
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		Name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", City=" + City + "]";
	}
	

}
