package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.ComplaintDao;
import com.slokam.healthcare.entity.Complaint;

@Service
public class CompalintService {
	@Autowired
private ComplaintDao complaintdao;
	public void savealldata(List<Complaint> complaint){
		complaintdao.saveAll(complaint);
	}
}
