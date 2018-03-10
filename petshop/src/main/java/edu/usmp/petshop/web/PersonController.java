package edu.usmp.petshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.usmp.petshop.petshop.Persona;

@Controller
public class PersonController {
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String initCreationForm(Model model) {
		model.addAttribute("person",new Persona());
		return "personForm";
	}
	
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public String submitForm() {
		return "resultForm";
	}

}
