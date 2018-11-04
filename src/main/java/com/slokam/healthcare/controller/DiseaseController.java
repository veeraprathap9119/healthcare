package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Disease;
import com.slokam.healthcare.service.DiseaseService;

@RestController
@RequestMapping("disease")
public class DiseaseController {
@Autowired
private DiseaseService diseaservice;
@PostMapping
public void savedata(@RequestBody Disease disease){
	diseaservice.savedata(disease);
}
@PostMapping("/all")
public void savealldata(@RequestBody List<Disease> ldisease){
	diseaservice.savealldata(ldisease);
}
}
