package com.mock.Hospital.Management.system.Controllers;

import com.mock.Hospital.Management.system.Model.Doctor;
import com.mock.Hospital.Management.system.Model.Hospital;
import com.mock.Hospital.Management.system.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceLayer {
    @Autowired
    RepositoryLayer repositoryLayerObj;

    public void addHospitals(Hospital hospital){
        repositoryLayerObj.addHospitalsToDB(hospital);
    }

    public void addPatients(Patient patient){
        repositoryLayerObj.addPatientsToDB(patient);
    }

    public void addDoctors(Doctor doctor){
        repositoryLayerObj.addDoctorsToDB(doctor);
    }

    public int noOfPatientsFromHospital(String hospitalName){
        return repositoryLayerObj.noOfPatientsFromHospitalFromDB(hospitalName);
    }

    public int largestHospitalOccupantOccupancy(String occupancy){
        return repositoryLayerObj.largestHospitalOccupantOccupancyFromDB(occupancy);
    }

    public Hospital hospitalRevenue(){
        return repositoryLayerObj.getHospitalWithMaxRevenue();
    }

    public void deletePatientDiseaseCured(String disease){
        repositoryLayerObj.deletePatientDiseaseCuredFromDB(disease);
    }
}
