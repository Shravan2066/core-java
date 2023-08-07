package com.xworkz.interfaces.app;

public class GovtHospital implements HospitalRules{

	@Override
	public void admitPatient(String patientName) {
		// TODO Auto-generated method stub
		System.out.println(patientName+"has been admitted");
	}

	@Override
	public void dischargePatient(String patientName) {
		// TODO Auto-generated method stub
		System.out.println(patientName + "has been discharged");
	}

	@Override
	public double calculateBill(String patientName) {
		// TODO Auto-generated method stub
		return 10000;
	}
	

}
