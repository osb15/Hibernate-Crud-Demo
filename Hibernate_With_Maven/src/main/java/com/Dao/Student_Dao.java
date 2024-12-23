package com.Dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.Query;

import com.entity.Student;

public class Student_Dao {

	public void Insert() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your ID :");
		int id = sc.nextInt();

		System.out.println("Please Enter Your Name :");
		String name = sc.next();

		System.out.println("Please Enter Your City :");
		String city = sc.next();

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student(id, name, city);
		ss.persist(s);
		System.out.println("Data Is Inserted.........");

		tr.commit();
		ss.close();

	}

	public void Update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your ID to update your details.:");
		int id = sc.nextInt();

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, id);

		System.out.println("Feel free to modify any details as needed.");

		s.getName();
		s.getCity();

		System.out.println("Please enter a new name.:");
		String name = sc.next();

		System.out.println("Please enter a new city.:");
		String city = sc.next();

		s.setName(name);
		s.setCity(city);

		ss.update(s);
		tr.commit();
		ss.close();

		System.out.println("The Updated ");
	}

	public void Delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the ID of the student you wish to delete:");
		int id = sc.nextInt();

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, id);

		ss.delete(s);

		System.out.println("Data Deleted");
		tr.commit();
		ss.close();

	}

	public void Display() 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		
		String hql = "FROM Student";
		List<Student> students = ss.createQuery(hql, Student.class).getResultList();

		for (Student student : students) 
		{
			System.out.println(student); 
		}

		ss.close();
	}
}
