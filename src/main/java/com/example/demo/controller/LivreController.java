package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

import java.util.List;

public class LivreController {

	@Autowired
	private LivreService livreService;




	//L’utilisateur peut avoir la liste des livres avec l’url 
	@GetMapping("/emsi_api/livres")
	public List<Livre> getAllBooks() {
	return this.livreService.getAllBooks();
	}

	//L’utilisateur peut avoir la liste un livre avec l’url 

	@GetMapping("/emsi_api/livres/{id}")
	public Livre getBookById(@PathVariable Integer id) {
	return this.livreService.getBookById(id);
	}



	//Update Book By Id

	@PutMapping("/emsi_api/livres/{id}")
	public Livre updateBookById(@RequestBody Livre livre, @PathVariable Integer id) {
	return livreService.updateBookById(livre, id);
	}


	//Delete Book By Id

	@DeleteMapping("/emsi_api/livres/{id}")
	public void deleteBookById(@PathVariable Integer id) {
	livreService.deleteBookById(id);
	}

}
