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
	

	 //@Query(value = "select new com.dbg.model.evaluation.Evaluation(e.points, e.user, e.film) from Evaluation as e where (:idUser is null OR e.user.getId() = %:idUser%) AND (:idFilm is null OR e.Film.getId() like %:idFilm%)")
	 //List<Evaluation> findByUserAndFilm(@Param(value = "idUser") String idUser, @Param(value = "idFilm") String idFilm);
	 
	//List<Evaluation> findByUser_idAndFilm_id(String User_id, String film_id);
		
}
