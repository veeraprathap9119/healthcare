package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.service.PatientService;
@RestController
public class PatientController {
	@Autowired
 private PatientService pser;
	@PostMapping
	public void savedata(@RequestBody Patient patient){
		pser.savedata(patient);
		
	}
	@RequestMapping("savealldata")
	public void savealldata(@RequestBody List<Patient>patient){
		pser.savealldata(patient);
		
	}
	@RequestMapping("patient/{name}")
	public List<Object[]> getdetails(@PathVariable("name") String name){
		return pser.getdetails(name) ;
	}
	@RequestMapping("pat/{name}")
	public List<String> getpatient(@PathVariable ("name") String name){
		return pser.getpatient(name);
		
	}
	@RequestMapping("patientdetails/{name}")
	public List<Object[]>getpatientdetails(@PathVariable("name") String name){
		return pser.getpatientdetails(name);
	}
	
}
