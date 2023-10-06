package com.mock.Hospital.Management.system.Model;

//Hospital : name, location, helpline no, no _ of doctors, occupancy
public class Hospital {
    private String name;
    private String location;
    private long helplineNo;
    private int noOfDoctors;
    private String occupancy;

    public Hospital(String name, String location, long helplineNo, int noOfDoctors, String occupancy) {
        this.name = name;
        this.location = location;
        this.helplineNo = helplineNo;
        this.noOfDoctors = noOfDoctors;
        this.occupancy = occupancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getHelplineNo() {
        return helplineNo;
    }

    public void setHelplineNo(long helplineNo) {
        this.helplineNo = helplineNo;
    }

    public int getNoOfDoctors() {
        return noOfDoctors;
    }

    public void setNoOfDoctors(int noOfDoctors) {
        this.noOfDoctors = noOfDoctors;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }
}
