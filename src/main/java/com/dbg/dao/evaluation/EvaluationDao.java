package com.dbg.dao.evaluation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbg.model.evaluation.Evaluation;;

@Repository
public interface EvaluationDao extends PagingAndSortingRepository<Evaluation,Integer>{

	public List<Evaluation> findByPointsGreaterThanEqual(Integer points);
	 
	 @Query(value = "select new com.dbg.model.evaluation.Evaluation(e.id,e.points,e.film, e.user) from Evaluation as e where (:idUser is null OR e.user.id = :idUser) AND ((:idFilm is null AND :idCategory is null ) OR e.film.id in( select f.id from Film as f where (:idCategory is null OR f.category.id = :idCategory) AND (:idFilm is null OR f.id = :idFilm) ))")
	 List<Evaluation> findByUserAndFilmAndCat(@Param(value = "idUser") Integer idUser, @Param(value = "idFilm") Integer idFilm, @Param(value = "idCategory") Integer idCategory);
		
}
