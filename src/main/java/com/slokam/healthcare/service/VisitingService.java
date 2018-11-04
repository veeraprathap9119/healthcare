package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.VisitingDao;
import com.slokam.healthcare.entity.Visiting;

@Service
public class VisitingService {
@Autowired
private VisitingDao visitingdao;
public void savealldata(List<Visiting> visiting){
	visitingdao.saveAll(visiting);
}
}
