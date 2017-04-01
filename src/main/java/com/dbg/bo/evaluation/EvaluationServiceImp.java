package com.dbg.bo.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.evaluation.EvaluationDao;
import com.dbg.dao.film.FilmDao;
import com.dbg.dao.user.UserDao;
import com.dbg.dto.EvaluationDTO;
import com.dbg.model.evaluation.Evaluation;
import com.dbg.model.film.Film;
import com.dbg.model.user.User;

@Service
public class EvaluationServiceImp implements EvaluationService{

	@Autowired
	private EvaluationDao evalDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private FilmDao filmDao;
	
	@Override
	public List<EvaluationDTO> findAll(final Integer idCategory,final Integer idUser,final Integer idFilm) {
		User user=userDao.findOne(idUser);
		Film film=filmDao.findOne(idFilm);
		
		
		return null;
	}

	@Override
	public EvaluationDTO findEvaluationById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EvaluationDTO create(EvaluationDTO e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EvaluationDTO update(Integer id, EvaluationDTO e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EvaluationDTO transform(Evaluation e,User u, Film f) {
		return new EvaluationDTO(e.getPoints(),u.getName(),f.getTitle());
	}

}
