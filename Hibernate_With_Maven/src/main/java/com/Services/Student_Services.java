package com.Services;

import com.Dao.Student_Dao;

public class Student_Services {
	
	public void Insert() {
		
		Student_Dao s = new Student_Dao();
		s.Insert();
		
	}
	
	public void Update() {
		Student_Dao s = new Student_Dao();
		s.Update();
	}

	public void Delete() {
		Student_Dao s = new Student_Dao();
		s.Delete();
	}
	
	public void Display() {
		
		Student_Dao s = new Student_Dao();
		s.Display();
		
	}
}
