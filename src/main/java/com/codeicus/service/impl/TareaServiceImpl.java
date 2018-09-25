package com.codeicus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codeicus.model.dao.interfaces.TareaDao;
import com.codeicus.model.entity.Tarea;
import com.codeicus.service.interfaces.TareaService;

@Service
public class TareaServiceImpl implements TareaService {

	@Autowired
	private TareaDao tareaDao;
	
	@Override
	@Transactional
	public void save(Tarea tarea) {
		
		tareaDao.save(tarea);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		tareaDao.delete(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Tarea> findAll() {

		return tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Tarea findById(Long id) {

		return tareaDao.findById(id);
	}

}
