package com.example.demo.repos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre ,Integer> {

}
