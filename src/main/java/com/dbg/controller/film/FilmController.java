package com.dbg.controller.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.bo.film.FilmService;
import com.dbg.dto.FilmDTO;

@RestController
@RequestMapping(value="/film")
public class FilmController {

	@Autowired
	private FilmService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<FilmDTO> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public FilmDTO findById(@PathVariable("id") Integer id){
		return service.findFilmById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public FilmDTO create(@RequestBody FilmDTO f){
		return service.create(f);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public FilmDTO create(@PathVariable("id") Integer id, @RequestBody FilmDTO f){
		return service.update(id, f);
	}
	
	
	@RequestMapping(value="/{id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		service.delete(id);
	}
}
