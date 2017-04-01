package com.dbg.bo.evaluation;

import java.util.List;

import com.dbg.dto.EvaluationDTO;
import com.dbg.model.evaluation.Evaluation;
import com.dbg.model.film.Film;
import com.dbg.model.user.User;

public interface EvaluationService {

	EvaluationDTO transform(Evaluation e, User u, Film f);
	
	//Evaluation transform(EvaluationDTO e);
	
	public List<EvaluationDTO> findAll(Integer idCategory,Integer idUser, Integer idFilm);
	
	public EvaluationDTO findEvaluationById(Integer id);
	
	public EvaluationDTO create(EvaluationDTO e);
	
	public void delete(Integer id);
	
	public EvaluationDTO update(Integer id, EvaluationDTO e);
}
