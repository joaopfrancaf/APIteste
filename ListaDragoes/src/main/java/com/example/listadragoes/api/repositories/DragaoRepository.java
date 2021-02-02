package com.example.listadragoes.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.listadragoes.api.entities.Dragao;

@Repository
public interface DragaoRepository extends JpaRepository<Dragao, Long > {
	
	Dragao findById(String id);

}
