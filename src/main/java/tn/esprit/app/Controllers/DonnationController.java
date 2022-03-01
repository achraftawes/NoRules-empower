package tn.esprit.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.Services.DonnationService;

@RestController
@RequestMapping("/donnation")
public class DonnationController {
	@Autowired
	DonnationService donnationService;
	@GetMapping("/count-all_donnation")
	@ResponseBody
	public int countAllDonnation()  {
	return	donnationService.countAllDonnation();
		
		
	}
}
