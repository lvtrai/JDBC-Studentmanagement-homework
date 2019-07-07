package vn.msita.studentmanagement.utils;

import java.util.ArrayList;

import vn.msita.studentmanagement.bo.Student;

public class StudentUtils {

	public static void displayStudentList(ArrayList<Student> studentList) {
		System.out.println(String.format("%-5s%-15s%-15s%-15s%-15s%-10s%15s",
				"ID", "FIRST_NAME", "LAST_NAME", "GENDDER", "AGE", "TELEPHONE","SCORES"));
		System.out.println(new String(new char[90]).replace("\0", "="));
		for (Student student : studentList) {
			//System.out.println(user.getId()+ " - " + user.getUserName() + " - " + user.getPassword() + " - " + user.getAge());
			System.out.println(String.format("%-5s%-15s%-15s%-15s%-15s%-15s%15f", student.getId(), student.getFirstName(),
					student.getLastName(),student.getGender(),student.getAge(),student.getTelephone(),
					student.getScores()));
		}
	}
	
	
	public static void displayStudent(Student student) {
		//System.out.println(user.getId()+ " - " + user.getUserName() + " - " + user.getPassword() + " - " + user.getAge());
		System.out.println(String.format("%-5s%-15s%-15s%-15s%-15s%-15s%15f", student.getId(), student.getFirstName(),
				student.getLastName(),student.getGender(),student.getAge(),student.getTelephone(),
				student.getScores()));
	}
}
