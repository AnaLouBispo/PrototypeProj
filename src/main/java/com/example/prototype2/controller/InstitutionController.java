package com.example.prototype2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prototype2.model.Institution;
import com.example.prototype2.repository.InstitutionRepo;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/prot")
public class InstitutionController {
	@Autowired
	private InstitutionRepo institutionRepo;
	@PostMapping("/createInst")
	public ResponseEntity<String> CreateInstitution(@ModelAttribute Model model, 
		@RequestParam("id")Optional<Long>id,
		@RequestParam("nameInstitution") String nameInstitution,
		@RequestParam("cnpjInstitution") String cnpjInstitution,
		@RequestParam("unitInstitution")  String unitInstitution
		){
		Institution institution = new Institution();
		institution.setNameInstitution(nameInstitution);
		institution.setCnpjInstitution(cnpjInstitution);
		institution.setUnitInstitution(unitInstitution);
		
		institutionRepo.save(institution);
		return ResponseEntity.ok("O nome da instituição é " + nameInstitution + " e a unidade é " + unitInstitution);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}