package com.mock.Hospital.Management.system.Controllers;
import com.mock.Hospital.Management.system.Model.Doctor;
import com.mock.Hospital.Management.system.Model.Hospital;
import com.mock.Hospital.Management.system.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//Create a hospital management system POST: Add  hospital, patients, doctors
//patient : name, age, gender, hospital, disease
//doctor : name, age, gender, speciality, hospital
//Hospital : name, location, helpline no, no of doctors, occupancy

//Get the number of patients being treated in a given hospital
//Get the hospital with the largest doctor occupancy
//Find the hospital that generated most amount of revenue if every patient gives equal fees to each hospital
//Delete the patient with the given disease cured

@RestController
@RequestMapping("/hospital-Management")
public class ControllerLayer {
    @Autowired
    ServiceLayer serviceLayerObj;

    @PostMapping("/add-Hospital")
    public ResponseEntity<String> addHospitals(@RequestBody Hospital hospital){
        serviceLayerObj.addHospitals(hospital);
        return new ResponseEntity<>("Hospital added to database", HttpStatus.CREATED);
    }

    @PostMapping("/add-Patient")
    public ResponseEntity<String> addPatients(@RequestBody Patient patient){
        serviceLayerObj.addPatients(patient);
        return new ResponseEntity<>("Patient added to database", HttpStatus.CREATED);
    }

    @PostMapping("/add-Doctor")
    public ResponseEntity<String> addDoctors(@RequestBody Doctor doctor){
        serviceLayerObj.addDoctors(doctor);
        return new ResponseEntity<>("Doctor added to database", HttpStatus.CREATED);
    }

    @GetMapping("/get-No-Of-Patients/{hospitalName}")
    public ResponseEntity<Integer> noOfPatientsFromHospital(@PathVariable String hospitalName){
        int noOfPatients = serviceLayerObj.noOfPatientsFromHospital(hospitalName);
        return new ResponseEntity<>(noOfPatients,HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-Largest-Occupancy-Hospital/{occupancy}")
    public ResponseEntity<Integer> largestHospitalOccupantOccupancy(@PathVariable String occupancy){
        int count = serviceLayerObj.largestHospitalOccupantOccupancy(occupancy);
        return new ResponseEntity<>(count,HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-Hospital-Revenue")
    public ResponseEntity<Hospital> hospitalRevenue(){
        Hospital hospital = serviceLayerObj.hospitalRevenue();
        return new ResponseEntity<>(hospital,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-cured-Patient/{disease}")
    public ResponseEntity<String> getPatientDiseaseCured(@PathVariable String disease){
        serviceLayerObj.deletePatientDiseaseCured(disease);
        return new ResponseEntity<>("Patient Deleted from Database",HttpStatus.CREATED);
    }

}
