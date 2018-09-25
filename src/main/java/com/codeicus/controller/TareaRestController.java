package com.codeicus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codeicus.model.entity.Tarea;
import com.codeicus.service.interfaces.TareaService;

@RestController
@CrossOrigin(origins= {"http://localhost:8080"})
@RequestMapping("/service")
public class TareaRestController {

	@Autowired
	private TareaService service;

	@PostMapping("/tarea")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Tarea tarea) {
		
		this.service.save(tarea);
	}
	
	@PutMapping("/tarea")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody Tarea tarea) {
		
		this.service.save(tarea);
	}
	
	@DeleteMapping("/tarea/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		this.service.delete(id);
	}

	@GetMapping("/tarea")
	public List<Tarea> findAll() {
		
		return this.service.findAll();
	}

	@GetMapping("/tarea/{id}")
	public Tarea findById(@PathVariable Long id) {
		
		return this.service.findById(id);
	}

}
