package com.nest.patientapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String patientname;

    private String patientmobile;
    private String appointmentdate;
    private String doctorname;

    public Patient() {
    }

    public Patient(int id, String patientname, String patientmobile, String appointmentdate, String doctorname) {
        this.id = id;
        this.patientname = patientname;
        this.patientmobile = patientmobile;
        this.appointmentdate = appointmentdate;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientmobile() {
        return patientmobile;
    }

    public void setPatientmobile(String patientmobile) {
        this.patientmobile = patientmobile;
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}
