package academic;

import java.util.*;

import actor.IAttendant;
import actor.IAttendee;
import actor.Lecturer;
import actor.Student;

public class Class {
	private String classCode, year;
	private int semester;
	
	private List<Course> courses = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	private List<Lecturer> lecturers = new ArrayList<>();
	private List<Student> attendances = new ArrayList<>();

	public Class(String classCode, int semester, String year) {
		this.classCode = classCode;
		this.semester = semester;
		this.year = year;
	}

	public void addCourse(Course co1) {
		courses.add(co1);
	}

	public void addStudent(Student student) {
		students.add(student);
		
		for(Course course: courses) {
			student.addCourse(semester, course);
		}
	}

	public void addLecturer(Lecturer lec1, Course co1) {
		lecturers.add(lec1);
		lec1.addCourseLecture(co1);
	}

	public void attend(IAttendant attend) {
		attend.attend();
		if(attend instanceof Student student) {
			attendances.add(student);
		}
	}

	public void takeAttendance(IAttendee attend) {
		attend.takeAttendance();
	}

	public void showTodayAttendance() {
		System.out.println("Today's attendance:");
		for(Student student: attendances) {
			System.out.println(" -"+student.getName());
		}
		
	}

}
