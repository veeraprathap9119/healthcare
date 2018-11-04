package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Medicine;
import com.slokam.healthcare.service.MedicineService;

@RestController
@RequestMapping("medicine")
public class MeddicineController {
@Autowired
private MedicineService medser;
@PostMapping
public void savedata(@RequestBody Medicine medicine){
	medser.savedata(medicine);
}
@PostMapping("/all")
public void savealldata(@RequestBody List<Medicine>medicine){
	medser.savealldata(medicine);
}
}
