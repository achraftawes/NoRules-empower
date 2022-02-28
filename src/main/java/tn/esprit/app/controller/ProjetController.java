package tn.esprit.app.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import tn.esprit.app.entities.Admin;
import tn.esprit.app.entities.Advertising;
import tn.esprit.app.entities.Chat;
import tn.esprit.app.entities.Comments;
import tn.esprit.app.entities.Posts;
import tn.esprit.app.entities.Women;
import tn.esprit.app.service.IProjet;




@RestController
public class ProjetController {
	
	@Autowired
	IProjet iprojet;
	
	
	
	@ApiOperation(value = "Récuperer la liste des Admins ")
	@GetMapping("/retrieve-all-Admins")
	@ResponseBody
	public List<Admin> getAdmins()  {
	List<Admin> listAdmins = iprojet.retrieveAllAdmins();
	return listAdmins;
	}
	
	@ApiOperation(value = "Récuperer le Admin de l'id mentionné  ")
	@GetMapping("/retrieve-Admin/{idAdmin}")
	@ResponseBody
	public Admin retrieveAdmin(@PathVariable("idAdmin") Long idAdmin) {
	return iprojet.retrieveAdmin(idAdmin);
	}

	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Admin  ")
	@PostMapping("/add-Admin")
	@ResponseBody
	public Admin addAdmin(@RequestBody Admin Admin)
	{
		Admin Admins = iprojet.addAdmin(Admin);
	return Admins;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Admin/{idAdmin}")
	@ResponseBody
	public void removeAdmin(@PathVariable("idAdmin") Long idAdmin) {
		iprojet.deleteAdmin(idAdmin);
	}

	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Admin")
	@ResponseBody
	public Admin modifyAdmin(@RequestBody Admin Admin) {
	return iprojet.updateAdmin(Admin);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@ApiOperation(value = "Récuperer la liste des Advertising ")
	@GetMapping("/retrieve-all-Advertising")
	@ResponseBody
	public List<Advertising> getAdvertisings()  {
	List<Advertising> listAdvertisings = iprojet.retrieveAllAdvertisings();
	return listAdvertisings;
	}
	
	@ApiOperation(value = "Récuperer le Advertising de l'id mentionné  ")
	@GetMapping("/retrieve-Advertising/{idAdvertising}")
	@ResponseBody
	public Advertising retrieveAdvertising(@PathVariable("idAdvertising") Long idAdvertising) {
	return iprojet.retrieveAdvertising(idAdvertising);
	}

	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Advertising  ")
	@PostMapping("/add-Advertising")
	@ResponseBody
	public Advertising addAdvertising(@RequestBody Advertising ad)
	{
		Advertising ads = iprojet.addAdvertising(ad);
		return ads;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Advertising/{idAdvertising}")
	@ResponseBody
	public void removeAdvertising(@PathVariable("idAdvertising") Long idAdvertising) {
		iprojet.deleteAdvertising(idAdvertising);
	}

	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Advertising")
	@ResponseBody
	public Advertising modifyAdvertising(@RequestBody Advertising Advertising) {
	return iprojet.updateAdvertising(Advertising);
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	@ApiOperation(value = "Récuperer la liste des Chat ")
	@GetMapping("/retrieve-all-Chat")
	@ResponseBody
	public List<Chat> getChats()  {
	List<Chat> listChats = iprojet.retrieveAllChats();
	return listChats;
	}
	
	@ApiOperation(value = "Récuperer le Advertising de l'id mentionné  ")
	@GetMapping("/retrieve-Chat/{idChat}")
	@ResponseBody
	public Chat retrieveChat(@PathVariable("idChat") Long idChat) {
	return iprojet.retrieveChat(idChat);
	}

	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Chat  ")
	@PostMapping("/add-Chat")
	@ResponseBody
	public Chat addChat(@RequestBody Chat Chat)
	{
		Chat Chats = iprojet.addChat(Chat);
		return Chats;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Chat/{idChat}")
	@ResponseBody
	public void removeChat(@PathVariable("idChat") Long idChat) {
		iprojet.deleteChat(idChat);
	}

	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Chat")
	@ResponseBody
	public Chat modifyChat(@RequestBody Chat Chat) {
	return iprojet.updateChat(Chat);
	}
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	@ApiOperation(value = "Récuperer la liste des Comments ")
	@GetMapping("/retrieve-all-Comments")
	@ResponseBody
	public List<Comments> getCommentss()  {
	List<Comments> listCommentss = iprojet.retrieveAllCommentss();
	return listCommentss;
	}
	
	@ApiOperation(value = "Récuperer le Comments de l'id mentionné  ")
	@GetMapping("/retrieve-Comments/{idCommentPost}")
	@ResponseBody
	public Comments retrieveComments(@PathVariable("idCommentPost") Long idCommentPost) {
	return iprojet.retrieveComments(idCommentPost);
	}
	
	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Comments  ")
	@PostMapping("/add-Comments")
	@ResponseBody
	public Comments addComments(@RequestBody Comments Comments)
	{
		Comments Commentss = iprojet.addComments(Comments);
	return Commentss;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Comments/{idCommentPost}")
	@ResponseBody
	public void removeComments(@PathVariable("idCommentPost") Long idCommentPost) {
	iprojet.deleteComments(idCommentPost);
	}
	
	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Comments")
	@ResponseBody
	public Comments modifyComments(@RequestBody Comments Comments) {
	return iprojet.updateComments(Comments);
	}


		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@ApiOperation(value = "Récuperer la liste des Posts ")
	@GetMapping("/retrieve-all-Posts")
	@ResponseBody
	public List<Posts> getPostss()  {
	List<Posts> listPostss = iprojet.retrieveAllPostss();
	return listPostss;
	}
	
	@ApiOperation(value = "Récuperer le Posts de l'id mentionné  ")
	@GetMapping("/retrieve-Posts/{idPost}")
	@ResponseBody
	public Posts retrievePosts(@PathVariable("idPost") Long idPost) {
	return iprojet.retrievePosts(idPost);
	}
	
	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Posts  ")
	@PostMapping("/add-Posts")
	@ResponseBody
	public Posts addPosts(@RequestBody Posts Posts)
	{
		Posts Postss = iprojet.addPosts(Posts);
	return Postss;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Posts/{idPost}")
	@ResponseBody
	public void removePosts(@PathVariable("idPost") Long idPost) {
	iprojet.deletePosts(idPost);
	}
	
	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Posts")
	@ResponseBody
	public Posts modifyPosts(@RequestBody Posts Posts) {
	return iprojet.updatePosts(Posts);
	}
	

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@ApiOperation(value = "Récuperer la liste des Women ")
	@GetMapping("/retrieve-all-Women")
	@ResponseBody
	public List<Women> getWomens()  {
	List<Women> listWomens = iprojet.retrieveAllWomens();
	return listWomens;
	}
	
	@ApiOperation(value = "Récuperer le Women de l'id mentionné  ")
	@GetMapping("/retrieve-Women/{idWomen}")
	@ResponseBody
	public Women retrieveWomens(@PathVariable("idWomen") Long idWomen) {
	return iprojet.retrieveWomen(idWomen);
	}
	
	// http://localhost:8085/SpringMVC/client/add-client
	@ApiOperation(value = "Ajouter un Women  ")
	@PostMapping("/add-Women")
	@ResponseBody
	public Women Women(@RequestBody Women Women)
	{
		Women Womens = iprojet.addWomen(Women);
	return Womens;
	}
	
	// http://localhost:8085/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-Women/{idWomen}")
	@ResponseBody
	public void removeWomens(@PathVariable("idWomen") Long idWomen) {
	iprojet.deleteWomen(idWomen);
	}
	
	// http://localhost:8085/SpringMVC/client/modify-client
	@PutMapping("/modify-Women")
	@ResponseBody
	public Women modifyWomen(@RequestBody Women Women) {
	return iprojet.updateWomen(Women);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}