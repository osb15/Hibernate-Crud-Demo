package com.Controller;

import java.util.Scanner;

import com.Services.Student_Services;

public class Student_Controller {

	public static void main(String[] args) {
		
		Student_Services ss = new Student_Services();
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		do {
			
			  System.out.println("---------------------------------------------------------------------");
			  System.out.println("Enter an option:\n1. Insert\n2. Delete\n3. Update\n4. Fetch\n5. Exit");
			  option = sc.nextInt();
			  switch(option) 
			  	{
			
			  		case 1 : ss.Insert();
			  		break;
			  		case 2 : ss.Update();
			  		break ;
			  		case 3 : ss.Delete();
			  		break ;
			  		case 4 : ss.Display();
			  		break;
			  		case 5 : System.out.println("Exiting the program...");
			  		break ;
			  		case 6 : System.out.println("The option provided is not valid........../n");
			  		break ;
			  	}
			}
		
			while (option != 5);

	}

	
}
