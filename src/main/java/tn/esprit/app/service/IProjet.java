package tn.esprit.app.service;

import java.util.List; 

import tn.esprit.app.entities.Admin;
import tn.esprit.app.entities.Advertising;
import tn.esprit.app.entities.Chat;
import tn.esprit.app.entities.Comments;
import tn.esprit.app.entities.Posts;


public interface IProjet {
	List<Admin> retrieveAllAdmins();

	Admin addAdmin(Admin a);

	void deleteAdmin(Long idAdmin);

	Admin updateAdmin(Admin a);

	Admin retrieveAdmin(Long idAdmin);
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	List<Advertising> retrieveAllAdvertisings();

	Advertising addAdvertising(Advertising ad);

	void deleteAdvertising(Long idAdvertising);

	Advertising updateAdvertising(Advertising ad);

	Advertising retrieveAdvertising(Long idAdvertising);
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	List<Chat> retrieveAllChats();

	Chat addChat(Chat chat);

	void deleteChat(Long idChat);

	Chat updateChat(Chat chat);

	Chat retrieveChat(Long idChat);
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	List<Comments> retrieveAllCommentss();

	Comments addComments(Comments Comments);

	void deleteComments(Long idCommentPost);

	Comments updateComments(Comments Comments);

	Comments retrieveComments(Long idCommentPost);
	
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	List<Posts> retrieveAllPostss();

	Posts addPosts(Posts Posts);

	void deletePosts(Long idPost);

	Posts updatePosts(Posts Posts);

	Posts retrievePosts(Long idPost);
	
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
}
