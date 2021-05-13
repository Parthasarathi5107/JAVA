package com.capg.jpa.p4;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class ExternalExam extends Examination{

	
	private int duration;
	private int marksObtained;

	public ExternalExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExternalExam(String examName, int marks, LocalDate examDate,int duration,int marksObtained) {
		super(examName, marks, examDate);
		// TODO Auto-generated constructor stub
		this.duration = duration;
		this.marksObtained = marksObtained;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	

	@Override
	public String toString() {
		return "ExternalExam [duration=" + duration + ", marksObtained=" + marksObtained + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + duration;
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
		ExternalExam other = (ExternalExam) obj;
		if (duration != other.duration)
			return false;
		return true;
	}

	
	
}
