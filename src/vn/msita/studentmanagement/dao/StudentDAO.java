package vn.msita.studentmanagement.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import vn.msita.studentmanagement.utils.ConnectionFactory;

public class StudentDAO {


	// 1 Print out the number of students
	public void numberOfStudents() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT COUNT(id) FROM student");
			//String Count = "";
			while (resultSet.next()) {
				//Count = resultSet.getString(1);
				System.out.println("Number of students: " + resultSet.getInt("COUNT(id)")+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 2 Print out the number of male students
	public void numberOfMaleStudents() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT COUNT(*) FROM student WHERE gender = 'Male'");
			String CountMale = "";
			while (resultSet.next()) {
				CountMale = resultSet.getString(1);
				System.out.println("Number of male students :" + CountMale+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 3 Print out the list of female students
	public void listOfFemaleStudents() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE gender = 'FeMale';");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7)+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 4 Print out a list of students who have not updated their phone numbers
	public void notHavePhoneNumbers() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE telephone IS null");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 5 Print out the list of students over 18 years old
	public void studentOver18YearsOld() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE age>18");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// 6. Print out a list of male students over 18 years old
	public void maleStudentsAndOver18YearsOld() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE gender = 'Male' AND age >18");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 7 Print out a list of good students(scores>80)
	public void studentGood() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE scores>80");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 8 Print weak students list (scores <45)
	public void studentWeak() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM student WHERE scores<45");
			while (resultSet.next()) {
				System.out.println("*"+resultSet.getString(1) + "-" + resultSet.getString(2) + "-" + resultSet.getString(3)
						+ "-" + resultSet.getString(4) + "-" + resultSet.getString(5) + "-" + resultSet.getString(6)
						+ "-" + resultSet.getString(7) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
