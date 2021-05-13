package com.capg.jpa.p1;

import javax.persistence.Embeddable;

@Embeddable
public class Course {

	private String courseName;
	private String courseStream;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, String courseStream) {
		super();
		this.courseName = courseName;
		this.courseStream = courseStream;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseStream() {
		return courseStream;
	}
	public void setCourseStream(String courseStream) {
		this.courseStream = courseStream;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseStream=" + courseStream + "]";
	}
	
	
}
