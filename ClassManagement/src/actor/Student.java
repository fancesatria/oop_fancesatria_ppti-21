package actor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import academic.Course;

public class Student extends Person implements IAttendant {
	private String nim;
//	private List<Course> courses = new ArrayList<>();
	private HashMap<Integer, Course> courses = new HashMap<>();
	private int credits = 0;
 
	public Student(String nim, String name, String dob) {
		super(name, dob);
		this.nim = nim;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	@Override
	public void attend(){
		System.out.println(name + " is attending the class");
	}

	public void showCredits(int i) {
//		for(Course course: courses) {
//			if(course.getCredit() == i) credits += course.getCredit();
//		}
		System.out.println(name+"'s credit: ");
		for(Entry<Integer, Course> entry: courses.entrySet()) {
			if(entry.getKey() == i) System.out.println(" -"+entry.getValue().getCourseName());
		}
		
	}
	
	public void addCourse(Integer semester, Course course) {
//		courses.add(course);
		courses.put(semester, course);
	}

	
	
}
