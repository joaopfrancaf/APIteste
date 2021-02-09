package com.example.listadragoes.api.controllers;
import com.example.listadragoes.api.entities.Dragao;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.listadragoes.api.repositories.DragaoRepository;

@RestController
public class DragaoController {

	@Autowired
	private DragaoRepository _dragaoRepository;

    @RequestMapping(value = "/dragao", method = RequestMethod.GET)
    public List<Dragao> Get() {
        return _dragaoRepository.findAll();
    }

    @RequestMapping(value = "/dragao", method =  RequestMethod.POST)
    public Dragao Post(@Valid @RequestBody Dragao drago)
    {
        return _dragaoRepository.save(drago);
    }
    
}