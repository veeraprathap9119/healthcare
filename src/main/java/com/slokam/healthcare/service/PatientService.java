package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.PatientDao;
import com.slokam.healthcare.entity.Patient;


@Service
public class PatientService {
@Autowired
private PatientDao pdao;
public void savedata(Patient patient){
	pdao.save(patient);
	
}
public void savealldata(List<Patient>patient){
	pdao.saveAll(patient);
}
public List<Object[]> getdetails(String name){
	return pdao.getdetails(name) ;
}
public List<String>  getpatient(String name){
	return pdao.getpatient(name);
}
public List<Object[]> getpatientdetails(String name){
	return pdao.getpatientdetails(name);
	
}


}

