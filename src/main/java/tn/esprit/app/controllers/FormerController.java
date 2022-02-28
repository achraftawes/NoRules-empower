package tn.esprit.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.app.entities.Former;
import tn.esprit.app.services.IFormerService;

@Controller
@RequestMapping("/former")
public class FormerController {
	
	@Autowired
	IFormerService formerS;
	
	// http://localhost:8086/SheApp/former/retrieve-all-formers
	
			@GetMapping("/retrieve-all-formers")
			@ResponseBody
				public List<Former> getAllFormers(){
					return formerS.getAllFormers();
			}

	// http://localhost:8086/SheApp/former/UpdateFormer/{id-former}
			@PutMapping("/UpdateFormer/{id-former}")
			@ResponseBody
			public String updateFormer(@RequestBody Former f , @PathVariable("id-former") Long id)throws  Exception {
				try {
				formerS.updateFormer(f, id);
				return ("The Former "+f.getFirstName()+" "+f.getLastName()+"'s profile updated successfully");
				}catch(Exception e) {
					return ("this id = " +id+ " doesn't exist ");
				}
			}
	// http://localhost:8086/SheApp/former/retrieveFormerById/{id-former}
			@GetMapping("/retrieveFormerById/{id-former}")
			@ResponseBody
			public String getFormerById(@PathVariable("id-former") Long id) throws Exception {
				try {
				
					 	return ("The Former wanted is "+formerS.getFormerById(id));
					}catch(Exception e) {
						return ("There is no Former with  id = "+id) ;
					}
			}
	// http://localhost:8086/SheApp/former/add-former
			@PostMapping("/add-former")
			@ResponseBody
			public Former addFormer(@RequestBody Former former) {
				 return formerS.addFormer(former);
			}
	
	// http://localhost:8086/SheApp/training/remove-former/{former-id}
			@DeleteMapping("/remove-former/{former-id}")
			@ResponseBody
			public String deleteF(@PathVariable ("former-id") Long idF) {
				formerS.deleteFormer(idF);
				return "former deleted Successefully";
			}
}
