package com.xworkz.interfaces.app;

public interface HostelRules {
	int maxOccupancy = 100;

    void checkIn(String guestName);
    void checkOut(String guestName);
    int getCurrentOccupancy();
}
