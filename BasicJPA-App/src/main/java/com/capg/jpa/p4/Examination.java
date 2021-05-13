package com.capg.jpa.p4;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.capg.jpa.p3.Insurance;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
		 name = "Exam_Type",
		 discriminatorType =DiscriminatorType.STRING
		)
public class Examination implements Comparable<Examination>,Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int examId;
	private String courseName;
	private int marks;
	private LocalDate examDate;
	
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examination(String examName, int marks, LocalDate examDate) {
		super();
		this.courseName = examName;
		this.marks = marks;
		this.examDate = examDate;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return courseName;
	}
	public void setExamName(String examName) {
		this.courseName = examName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public LocalDate getExamDate() {
		return examDate;
	}
	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}
	
	
	
	@Override
	public String toString() {
		return "Examination [examId=" + examId + ", courseName=" + courseName + ", marks=" + marks + ", examDate="
				+ examDate + "]";
	}



	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((examDate == null) ? 0 : examDate.hashCode());
		result = prime * result + examId;
		result = prime * result + marks;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examination other = (Examination) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (examDate == null) {
			if (other.examDate != null)
				return false;
		} else if (!examDate.equals(other.examDate))
			return false;
		if (examId != other.examId)
			return false;
		if (marks != other.marks)
			return false;
		return true;
	}
	@Override
	public int compareTo(Examination o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
