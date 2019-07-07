package vn.msita.studentmanagement.main;

import vn.msita.studentmanagement.dao.StudentDAO;

public class Main {

	public static void main(String[] args) {
	StudentDAO studentDAO = new StudentDAO();
	
	studentDAO.numberOfStudents();
	
	studentDAO.numberOfMaleStudents();
	
	System.out.println("List of female students:");
	studentDAO.listOfFemaleStudents();
	
	System.out.println("Student not have telephone:");
	studentDAO.notHavePhoneNumbers();
	
	System.out.println("List of students over 18 years old:");
	studentDAO.studentOver18YearsOld();
	
	System.out.println("List of male students over 18 years old:");
	studentDAO.maleStudentsAndOver18YearsOld();
	
	System.out.println("List of good students(scores>80):");
	studentDAO.studentGood();
	
	System.out.println("List of weak students(scores<45):");
	studentDAO.studentWeak();
	
	}
}
