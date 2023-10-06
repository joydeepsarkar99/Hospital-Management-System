package com.mock.Hospital.Management.system.Model;

//doctor : name, age, gender, speciality, hospital
public class Doctor {
    private String name;
    private int age;
    private String gender;
    private String speciality;
    private String hospitalName;

    public Doctor(String name, int age, String gender, String speciality, String hospitalName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.hospitalName = hospitalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
