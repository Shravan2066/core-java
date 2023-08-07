package com.xworkz.interfaces.app;

public interface HospitalRules {
	 int maxPatients = 500;
	    double consultationFee = 50.0;

	    void admitPatient(String patientName);
	    void dischargePatient(String patientName);
	    double calculateBill(String patientName);
}
