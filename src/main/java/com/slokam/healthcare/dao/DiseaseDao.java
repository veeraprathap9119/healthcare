package com.slokam.healthcare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Disease;
@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer>{

}
