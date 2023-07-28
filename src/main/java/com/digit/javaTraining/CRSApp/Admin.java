package com.digit.javaTraining.CRSApp;

import java.util.Scanner;

import com.digit.javaTraining.helpers.CourseHelper;
import com.digit.javaTraining.helpers.ProfessorHelper;
import com.digit.javaTraining.helpers.StudentHelper;

public class Admin {
	String username;
	String password;

	public Admin() {
		this.username = "admin";
		this.password = "Admin";
	}

	public boolean checkUsernamePassword() {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("\n---ADMIN LOGIN---");

		System.out.println("Enter Admin Username:");
		String name = sc.next();
		System.out.println("Enter Admin Password");
		String pass = sc.next();

		if (name.equals(username) && pass.equals(this.password))
			return true;
		return false;
	}

	static void printAdminMenu() {
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("          ADMIN MENU          ");
		System.out.println("-----------------------------");
		System.out.println("1. Add Course");
		System.out.println("2. Add Professor");
		System.out.println("3. Add Student");
		System.out.println("4. Goto Main Menu");
	}

	static public void adminMenu(Admin ad) {
		Scanner sc = new Scanner(System.in);
		Course c;

		printAdminMenu();
		System.out.println("Select an option:");
		int userInput = sc.nextInt();
		if (userInput == 1) {
			CourseHelper.addCourse();
			adminMenu(ad);

		} else if (userInput == 2) {
			ProfessorHelper.addProfessor();
			adminMenu(ad);
		} else if (userInput == 3) {
			StudentHelper.addStudent();
			adminMenu(ad);
		} else if (userInput == 4) {
			Launch.mainMenu(ad);
		} else {
			return;
		}
	}

}
