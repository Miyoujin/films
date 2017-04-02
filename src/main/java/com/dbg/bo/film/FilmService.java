package com.dbg.bo.film;

import java.util.List;

import com.dbg.dto.FilmDTO;
import com.dbg.model.film.Film;


public interface FilmService {

	FilmDTO transform(Film f);
	
	Film transform(FilmDTO f);
	
	public List<FilmDTO> findAll();
	
	public List<FilmDTO> findByCategory_idAndFilm_id(Integer catId, Integer id);
	
	public FilmDTO findFilmById(Integer id);
	
	public FilmDTO create(FilmDTO f);
	
	public void delete(Integer id);
	
	public FilmDTO update(Integer id, FilmDTO f);
	
}
