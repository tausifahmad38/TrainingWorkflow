package com.hcl.elch.freshersuperchargers.trainingworkflow.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.elch.freshersuperchargers.trainingworkflow.entity.Category;
import com.hcl.elch.freshersuperchargers.trainingworkflow.entity.workflow;


public interface CategoryRepo extends JpaRepository<Category, Long>{
	
	

}
