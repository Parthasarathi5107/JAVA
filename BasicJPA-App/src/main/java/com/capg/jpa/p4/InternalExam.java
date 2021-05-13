package com.capg.jpa.p4;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class InternalExam  extends Examination{

	
	private int marksObtained;
	private int noOfChapters;
	public InternalExam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InternalExam(String examName, int marks, LocalDate examDate,int marksObtained, int noOfChapters) {
		super(examName, marks, examDate);
		// TODO Auto-generated constructor stub
		this.marksObtained = marksObtained;
		this.noOfChapters = noOfChapters;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	public int getNoOfChapters() {
		return noOfChapters;
	}
	public void setNoOfChapters(int noOfChapters) {
		this.noOfChapters = noOfChapters;
	}
	@Override
	public String toString() {
		return "InternalExam [marksObtained=" + marksObtained + ", noOfChapters=" + noOfChapters + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + marksObtained;
		result = prime * result + noOfChapters;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InternalExam other = (InternalExam) obj;
		if (marksObtained != other.marksObtained)
			return false;
		if (noOfChapters != other.noOfChapters)
			return false;
		return true;
	}
	
	
	
	
}
