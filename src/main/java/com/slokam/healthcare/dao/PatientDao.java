package com.slokam.healthcare.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
@Query("select p.name,do.name,di.name from Medication md  "
		+ " join md.medicne m "
		+ " join md.complaint c "
		+ " join c.disease di "
		+ " join c.visiting v  "
		+ " join v.doctor do "
		+ " join v.appointment a "
		+ "join a.patient p where m.name=?1")
			
public List<Object[]> getdetails(String name);

@Query("select p.name from Complaint c "
		+ " join c.disease di "
		+ " join c.visiting v "
		+ " join v.appointment a "
		+ "join a.patient p where di.name=?1 "
		)
public List<String>  getpatient(String name);
@Query("select p.name,p.phone from Complaint c "
		+ "join c.visiting v "
		+ "join v.doctor d "
		+ "join v.appointment a "
		+ "join a.patient p where d.name=?1 ")
public List<Object[]> getpatientdetails(String name);
@Query("select p.name from Appointment a join a.patient p where a.dateTime between ?1 and ?2 ")
public List<String> getdetailsbydate(Date sdate,Date edate);
}
