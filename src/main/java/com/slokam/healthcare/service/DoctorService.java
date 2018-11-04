package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.DoctorDao;
import com.slokam.healthcare.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
private DoctorDao ddao;
	public void savedata(Doctor doctor){
	ddao.save(doctor);
		
	}
	public void saveall(List<Doctor>doctor){
		ddao.saveAll(doctor);
	}
}
