package com.dbg.dao.film;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbg.model.film.Film;


@Repository
public interface FilmDao extends PagingAndSortingRepository<Film,Integer>{
	public List<Film> findByYearGreaterThanEqual(Integer year);
	
	public List<Film> findByTitleContaining(String title);
	public List<Film> findByCategory_id(Integer id);
	
	@Query(value = "select new com.dbg.model.film.Film(f.id, f.title, f.year,f.category) from Film as f where (:catId is null OR f.category.id = :catId) AND (:id is null OR f.id = :id)")
	public List<Film> findByCategory_idAndId(@Param(value = "catId")Integer catId,@Param(value = "id")Integer id);
	//public List<Film> findByCategory_idAndIdIn(Integer catId,Integer id);
}
