package com.codeicus.model.dao.interfaces;

import java.util.List;

import com.codeicus.model.entity.Tarea;

public interface TareaDao {

	void save(Tarea tarea);
	void delete(Tarea tarea);
	List<Tarea> findAll();
	Tarea findById(Integer id);

}
