package com.slokam.healthcare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Appointment;
@Repository
public interface AppointmentDao  extends JpaRepository<Appointment, Integer>{

}
