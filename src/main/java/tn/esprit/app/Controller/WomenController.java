package tn.esprit.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.Service.WomenService;
import tn.esprit.app.entity.Women;

@RestController
@RequestMapping("/Women")
public class WomenController {
	@Autowired
	WomenService womenService ;
	@PostMapping("/addWomen")
	@ResponseBody
	public void addWomen(@RequestBody Women women) {
	womenService.addWomen(women);
	}
	@DeleteMapping("/remove-women/{idWomen}")
	@ResponseBody
	public void removeWomen(@PathVariable("idWomen") Long idWomen) {
		womenService.removeWomen(idWomen);
	}
	@PutMapping("/update-Women")
	@ResponseBody
	public void  updateWomen(@RequestBody Women women) {
	womenService.updateWomen(women);
	}
	@GetMapping("/retrieve-all-women")
	@ResponseBody
	public List<Women> getWomens() {
	List<Women> listWomen = womenService.retrieveAllWomen();
	return listWomen;


	}


}
