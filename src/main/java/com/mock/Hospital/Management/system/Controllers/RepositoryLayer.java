package com.mock.Hospital.Management.system.Controllers;

import com.mock.Hospital.Management.system.Model.Doctor;
import com.mock.Hospital.Management.system.Model.Hospital;
import com.mock.Hospital.Management.system.Model.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class RepositoryLayer {

    HashMap<String, Hospital> hospitalHashMap;
    HashMap<String, Patient> patientHashMap;
    HashMap<String, Doctor> doctorHashMap;
    HashMap<String,Integer> hospitalPatientMap;

    RepositoryLayer(){
        hospitalHashMap = new HashMap<>();
        patientHashMap = new HashMap<>();
        doctorHashMap = new HashMap<>();
        hospitalPatientMap = new HashMap<>();
    }

    public void addHospitalsToDB(Hospital hospital){
        String key = hospital.getName();
        hospitalHashMap.put(key,hospital);
    }

    public void addPatientsToDB(Patient patient){
        String key = patient.getName();
        patientHashMap.put(key,patient);
    }

    public void addDoctorsToDB(Doctor doctor){
        String key = doctor.getName();
        doctorHashMap.put(key,doctor);
    }

    public int noOfPatientsFromHospitalFromDB(String hospitalName){
        int count = 0;
        for(Patient patient : patientHashMap.values()){
            if(patient.getHospitalName().equals(hospitalName)){
                count++;
            }
        }
        return count;
    }

    public int largestHospitalOccupantOccupancyFromDB(String occupancy){
        int mxCount = Integer.MIN_VALUE;
        for(Hospital hospital : hospitalHashMap.values()){
            if(hospital.getOccupancy().equals(occupancy)){
                mxCount = Math.max(mxCount,hospital.getNoOfDoctors());
            }
        }
        return mxCount;
    }

    public Hospital getHospitalWithMaxRevenue(){
        for(Patient patient : patientHashMap.values()){
            hospitalPatientMap.put(patient.getHospitalName(),hospitalPatientMap.getOrDefault(patient.getHospitalName(),0)+1);
        }
        int mxCount = Integer.MIN_VALUE;
        String hospitalName = "";
        for(String name : hospitalPatientMap.keySet()){
            int val = hospitalPatientMap.get(name);
            if(mxCount < val){
                mxCount = val;
                hospitalName = name;
            }
        }
        if(hospitalHashMap.containsKey(hospitalName)){
            return hospitalHashMap.get(hospitalName);
        }
        return null;
    }

    public void deletePatientDiseaseCuredFromDB(String disease){
        for(Patient patient : patientHashMap.values()){
            if(patient.getDisease().equals((disease))){
                patientHashMap.remove(patient.getName());
            }
        }
    }
}
