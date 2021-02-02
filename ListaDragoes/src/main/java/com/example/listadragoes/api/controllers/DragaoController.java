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

    @RequestMapping(value = "/dragao/{id}", method = RequestMethod.GET)
    public ResponseEntity<Dragao> GetById(@PathVariable(value = "id") long id)
    {
        Optional<Dragao> pessoa = _dragaoRepository.findById(id);
        if(pessoa.isPresent())
            return new ResponseEntity<Dragao>(pessoa.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/dragao", method =  RequestMethod.POST)
    public Dragao Post(@Valid @RequestBody Dragao pessoa)
    {
        return _dragaoRepository.save(pessoa);
    }

    @RequestMapping(value = "/dragao/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Dragao> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Dragao newPessoa)
    {
        Optional<Dragao> oldPessoa = _dragaoRepository.findById(id);
        if(oldPessoa.isPresent()){
        	Dragao pessoa = oldPessoa.get();
             pessoa.setName(newPessoa.getName());
             _dragaoRepository.save(pessoa);
             return new ResponseEntity<Dragao>(pessoa, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/dragao/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Dragao> pessoa = _dragaoRepository.findById(id);
        if(pessoa.isPresent()){
            _dragaoRepository.delete(pessoa.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}