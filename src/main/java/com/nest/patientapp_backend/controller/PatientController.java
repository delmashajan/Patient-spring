package com.nest.patientapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PatientController {

    @PostMapping("/add")
    public String Addpatient(){
        return "welcome to add patient";
    }

    @GetMapping("/view")
    public String Viewpatient(){
        return "welcome to view patient";
    }


}
