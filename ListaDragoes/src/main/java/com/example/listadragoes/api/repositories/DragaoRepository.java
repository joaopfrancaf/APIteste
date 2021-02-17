package com.example.listadragoes.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.listadragoes.api.entities.Dragao;

@Repository
public interface DragaoRepository extends CrudRepository<Dragao, Long > {

}
