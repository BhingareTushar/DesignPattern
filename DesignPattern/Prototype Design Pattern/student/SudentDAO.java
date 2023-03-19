package com.kkjavatutorials.prototype;

import java.util.ArrayList;
import java.util.List;
/**
 * @author KK JavaTutorials
 * Dummy Student DAO implementation
 * In Real Scenario Object can be constructed by calling database.
 */
public class StudentDAO implements Cloneable{

	private static List<Student> studentList;
	
	static {
		studentList = new ArrayList<>();

		Student student1 = new Student();
		student1.setId(10);
		student1.setName("PK");

		Student student2 = new Student();
		student2.setId(20);
		student2.setName("MK");

		studentList.add(student1);
		studentList.add(student2);
	}
	
	/**
	 * In Real Scenario Object can be constructed by calling database.
	 * @return Student List
	 */
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	/**
	 * Creating Clone of an Existing object
	 */
	@Override
	public List<Student> clone() throws CloneNotSupportedException {
		
		List<Student> dummyStudentList = new ArrayList<>();
		for (Student student : studentList) {
			dummyStudentList.add(student);
		}
		return dummyStudentList;
	}
}