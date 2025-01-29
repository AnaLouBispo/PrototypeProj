package Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Models.Institution;
import Repository.InstitutionRepo;
import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/prot")
public class InstitutionController {
	@Autowired
	private InstitutionRepo institutionrepo;
	@PostMapping("/createInst")
	public void CreateInstitution(@ModelAttribute  Model model, 
		@RequestParam("id")Optional<Long>id,
		@RequestParam("nameInstitution") String nameInstitution,
		@RequestParam("cnpjInstitution") String cnpjInstitution,
		@RequestParam("unitInstution")  String unitInstution
		){	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
