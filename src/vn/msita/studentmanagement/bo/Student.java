package vn.msita.studentmanagement.bo;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String telephone;
	private double scores;
	
	
	
	public Student() {
		
	}
	
	
	public Student(int id, String firstName, String lastName, String gender, int age, String telephone, double scores) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.telephone = telephone;
		this.scores = scores;
	}






	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public double getScores() {
		return scores;
	}
	public void setScores(double d) {
		this.scores = d;
	}
		
}
