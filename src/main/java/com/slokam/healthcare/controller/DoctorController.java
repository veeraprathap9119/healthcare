package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Doctor;
import com.slokam.healthcare.service.DoctorService;
@RequestMapping("doctor")
@RestController
public class DoctorController {
	@Autowired
private DoctorService ds;
	@PostMapping
	public void savedata(@RequestBody Doctor doctor){
		ds.savedata(doctor);
	}
	@PostMapping("/all")
	public void savealldata(@RequestBody List<Doctor>doctor){
		ds.saveall(doctor);
	}
}
