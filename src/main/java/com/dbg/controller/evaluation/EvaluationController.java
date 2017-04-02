package com.dbg.controller.evaluation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.bo.evaluation.EvaluationService;
import com.dbg.dto.EvaluationDTO;

@RestController
@RequestMapping(value="/evaluation")
public class EvaluationController {
	
	@Autowired
	private EvaluationService service;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<EvaluationDTO> findByCatId(@RequestParam(value = "idCategory", required = false)Integer idCategory,@RequestParam(value = "idUser", required = false)Integer idUser,@RequestParam(value = "idFilm", required = false) Integer idFilm){
		return service.findAll(idCategory, idUser, idFilm);
	}

}
