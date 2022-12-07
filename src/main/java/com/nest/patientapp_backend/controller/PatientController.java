package com.nest.patientapp_backend.controller;

import com.nest.patientapp_backend.dao.PatientDao;
import com.nest.patientapp_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String, String> Addpatient(@RequestBody Patient p){

        System.out.println(p.getPatientname().toString());
        System.out.println(p.getPatientmobile().toString());
        System.out.println(p.getAppointmentdate().toString());
        System.out.println(p.getDoctorname().toString());

        dao.save(p);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> Viewpatient(){
        return (List<Patient>) dao.findAll();
    }


}
