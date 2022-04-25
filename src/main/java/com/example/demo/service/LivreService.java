package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;

import java.util.List;

@Component
public class LivreService {

	@Autowired
	private LivreRepo livreRepo;



	public List<Livre> getAllBooks(){
	return livreRepo.findAll();
	}

	// Find Book By Id
	public Livre getBookById(int id) {
	return livreRepo.findById(id).get();
	}

	//supprimmer book By Id
	public void deleteBookById(int id) {
	livreRepo.deleteById(id);
	}


	//Update book By Id



	public Livre updateBookById(Livre livre, int id) {
	Livre getBook = livreRepo.getById(id);
	getBook.setTitre(livre.getTitre());
	getBook.setDateSortie(livre.getDateSortie());
	getBook.setAuteur(livre.getAuteur());
	getBook.setNombrePage(livre.getNombrePage());
	getBook.setDateDerniereConsultation(livre.getDateDerniereConsultation());

	return livreRepo.save(getBook);
	}
}
