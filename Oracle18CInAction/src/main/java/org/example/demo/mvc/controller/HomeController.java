package org.example.demo.mvc.controller;

import org.example.demo.business.service.PatientService;
import org.example.demo.mvc.view.HomeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {

		HomeForm homeForm = new HomeForm();
		homeForm.setPatient(this.patientService.findPatientById("PT0000000001"));
		homeForm.setDbInfo("Hello Oracle!");
		model.addAttribute("homeForm", homeForm);
		return "home";

	}
}
