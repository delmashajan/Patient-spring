package com.nest.patientapp_backend.dao;

import com.nest.patientapp_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `appointmentdate`, `doctorname`, `patientmobile`, `patientname` FROM `patient` WHERE `patientname` LIKE %:patientname%",nativeQuery = true)
    List<Patient> Searchpatient (@Param("patientname") String patientname);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient` WHERE `id`=:id",nativeQuery = true)
    void deletePatient(@Param("id") Integer id);

}
