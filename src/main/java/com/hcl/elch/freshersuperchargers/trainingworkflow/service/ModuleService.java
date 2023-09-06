package com.hcl.elch.freshersuperchargers.trainingworkflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.elch.freshersuperchargers.trainingworkflow.entity.Modules;
import com.hcl.elch.freshersuperchargers.trainingworkflow.repo.ModuleRepo;

@Service
public class ModuleService {
	
	@Autowired
	private ModuleRepo moduleRepo;

	public List<Modules> getModules() {
		
		return moduleRepo.findAll();
	}
	
//	public String addModule(Modules m) {
//		Modules m1=new Modules();
//		if(moduleRepo.getByModuleId(m.getModuleId())!=null) {
//			return "Module id "+m.getModuleId()+" already exist";
//		}
//		else if(moduleRepo.getBymoduleName(m.getModuleName().toUpperCase())!=null) {
//			return "ModuleName "+m.getModuleName()+"already exist";
//			
//		}
//		else {
//			
//			moduleRepo.save(m);
//		}
//
//		 return "Modules added succesfully";
//	}

}
