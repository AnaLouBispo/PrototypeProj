package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Models.Institution;
import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/prot")
public class InstitutionController {
	@Autowired

	@PostMapping("/createInst")
	public void CreateInstitution(@ModelAttribute Institution institution, Model model) {

	}

}
