package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.DiseaseDao;
import com.slokam.healthcare.entity.Disease;

@Service
public class DiseaseService {
@Autowired
private DiseaseDao dis;
	public void savedata(Disease disease){
	dis.save(disease);	
}
	public void savealldata(List<Disease> ldisease){
		dis.saveAll(ldisease);
	}
}
