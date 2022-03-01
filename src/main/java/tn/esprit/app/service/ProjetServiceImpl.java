package tn.esprit.app.service;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.app.entities.Admin;
import tn.esprit.app.entities.Advertising;
import tn.esprit.app.entities.Chat;
import tn.esprit.app.entities.Comments;
import tn.esprit.app.entities.Posts;

import tn.esprit.app.repository.AdminRepository;
import tn.esprit.app.repository.AdvertisingRepository;
import tn.esprit.app.repository.ChatRepository;
import tn.esprit.app.repository.CommentsRepository;
import tn.esprit.app.repository.PostsRepository;







@Service
@Slf4j
public class ProjetServiceImpl implements IProjet{
	
	@Autowired
	AdminRepository adminrepo;
	
	@Autowired
	AdvertisingRepository advertisingrepo;
	
	@Autowired
	ChatRepository chatrepo;
	
	@Autowired
	CommentsRepository commentsrepo;
	
	@Autowired
	PostsRepository postrepo;
	

	
	@Override
	public List<Admin> retrieveAllAdmins() {
		List<Admin> admins =(List<Admin>) adminrepo.findAll();
		for (Admin admin : admins ) {
	  log.info("admin : "+ admin );
		}
		return admins ;
	
	}
	
	@Override
	public Admin retrieveAdmin(Long idAdmin) {
		Admin admin=adminrepo.findById(idAdmin).get();
		return admin;
	}
	
	@Override
	public Admin addAdmin(Admin a) {
		adminrepo.save(a);
		return a;
	}

	@Override
	public void deleteAdmin(Long idAdmin) {
		adminrepo.deleteById(idAdmin);
		
	}

	@Override
	public Admin updateAdmin(Admin a) {
		adminrepo.save(a);
		return a ;
	}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public List<Advertising> retrieveAllAdvertisings() {
		List<Advertising> advertis =(List<Advertising>) advertisingrepo.findAll();
		for (Advertising advertising : advertis ) {
	  log.info("advertising : "+ advertising );
		}
		return advertis ;
	}

	@Override
	public Advertising addAdvertising(Advertising ad) {
		advertisingrepo.save(ad);
		return ad;
	}

	@Override
	public void deleteAdvertising(Long idAdvertising) {
		advertisingrepo.deleteById(idAdvertising);
	}

	@Override
	public Advertising updateAdvertising(Advertising ad) {
		advertisingrepo.save(ad);
		return ad ;
	}

	@Override
	public Advertising retrieveAdvertising(Long idAdvertising) {
		Advertising adver=advertisingrepo.findById(idAdvertising).get();
		return adver;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Override
	public List<Chat> retrieveAllChats() {
		List<Chat> chat =(List<Chat>) chatrepo.findAll();
		for (Chat Chat : chat ) {
	  log.info("Chat : "+ Chat );
		}
		return chat ;
	}

	@Override
	public Chat addChat(Chat chat) {
		chatrepo.save(chat);
		return chat;
	}

	@Override
	public void deleteChat(Long idChat) {
		chatrepo.deleteById(idChat);
		
	}

	@Override
	public Chat updateChat(Chat chat) {
		chatrepo.save(chat);
		return chat ;
	}

	@Override
	public Chat retrieveChat(Long idChat) {
		Chat Chat=chatrepo.findById(idChat).get();
		return Chat;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public List<Comments> retrieveAllCommentss() {
		List<Comments> Comments =(List<Comments>) commentsrepo.findAll();
		for (Comments Comment : Comments ) {
	  log.info("Comments : "+ Comment );
		}
		return Comments ;
	}

	@Override
	public Comments addComments(Comments Comments) {
		commentsrepo.save(Comments);
		return Comments;
	}

	@Override
	public void deleteComments(Long idCommentPost) {
		commentsrepo.deleteById(idCommentPost);
		
	}

	@Override
	public Comments updateComments(Comments Comments) {
		commentsrepo.save(Comments);
		return Comments ;
	}

	@Override
	public Comments retrieveComments(Long idCommentPost) {
		Comments Comments=commentsrepo.findById(idCommentPost).get();
		return Comments;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public List<Posts> retrieveAllPostss() {
		List<Posts> Posts =(List<Posts>) postrepo.findAll();
		for (Posts Post : Posts ) {
	  log.info("Posts : "+ Post );
		}
		return Posts ;
	}

	@Override
	public Posts addPosts(Posts Posts) {
		postrepo.save(Posts);
		return Posts;
	}

	@Override
	public void deletePosts(Long idPost) {
		postrepo.deleteById(idPost);
		
	}

	@Override
	public Posts updatePosts(Posts Posts) {
		postrepo.save(Posts);
		return Posts ;
	}

	@Override
	public Posts retrievePosts(Long idPost) {
		Posts Posts=postrepo.findById(idPost).get();
		return Posts;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
