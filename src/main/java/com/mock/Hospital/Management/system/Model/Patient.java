package com.mock.Hospital.Management.system.Model;

//patient : name, age, gender, hospital, disease
public class Patient {
    private String name;
    private int age;
    private String gender;
    private String HospitalName;
    private String disease;

    public Patient(String name, int age, String gender, String hospitalName, String disease) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        HospitalName = hospitalName;
        this.disease = disease;
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

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
