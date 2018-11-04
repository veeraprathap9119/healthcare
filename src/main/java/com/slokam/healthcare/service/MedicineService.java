package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.MedicineDao;
import com.slokam.healthcare.entity.Medicine;

@Service
public class MedicineService {
	@Autowired
private MedicineDao md;
	public void savedata(Medicine medicine){
		md.save(medicine);
	}
	public void savealldata(List<Medicine> medicine){
		md.saveAll(medicine);
	}
}
