package com.slokam.healthcare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Visiting;
@Repository
public interface VisitingDao extends JpaRepository<Visiting, Integer> {

}
