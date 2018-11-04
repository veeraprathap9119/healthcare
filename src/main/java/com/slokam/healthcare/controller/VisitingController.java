package com.slokam.healthcare.controller;

import java.util.List;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Visiting;
import com.slokam.healthcare.service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	@Autowired
private VisitingService vistingservice;
	@PostMapping("/all")
	public void savealldata(@RequestBody List<Visiting> visiting){
		vistingservice.savealldata(visiting);	
	}
}
