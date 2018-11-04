package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.dao.AppointmentDao;
import com.slokam.healthcare.entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
private AppointmentDao appointmentdao;
	public void savealldata(List<Appointment>appointment){
		appointmentdao.saveAll(appointment);
	}
}
