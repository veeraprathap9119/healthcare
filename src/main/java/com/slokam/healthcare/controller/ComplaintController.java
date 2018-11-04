package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Complaint;
import com.slokam.healthcare.service.CompalintService;

@RestController
@RequestMapping("complaint")
public class ComplaintController {
	@Autowired
	private CompalintService complaintservice;
	@PostMapping("/all")
	public void savealldata(@RequestBody List<Complaint> complaint){
		complaintservice.savealldata(complaint);
	}

}
