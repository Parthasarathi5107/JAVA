package com.capg.jpa.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	
	private String certificatename;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub	
}

	public Certificate(String certificatename) {
		super();
		this.certificatename = certificatename;
	}

	public String getCertificatename() {
		return certificatename;
	}

	public void setCertificatename(String certificatename) {
		this.certificatename = certificatename;
	}

	@Override
	public String toString() {
		return "Certificate [certificatename=" + certificatename + "]";
	}
	
	
	
}
