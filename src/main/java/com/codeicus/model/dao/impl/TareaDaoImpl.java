package com.codeicus.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.codeicus.model.dao.interfaces.TareaDao;
import com.codeicus.model.entity.Tarea;

@Repository
public class TareaDaoImpl implements TareaDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Tarea tarea) {

		if(tarea.getId() != null) this.em.merge(tarea);
		else this.em.persist(tarea);
	}

	@Override
	public void delete(Long id) {

		this.em.remove(this.findById(id));
	}

	@Override
	public List<Tarea> findAll() {

		return this.em.createNamedQuery(Tarea.FIND_ALL, Tarea.class).getResultList();
	}

	@Override
	public Tarea findById(Long id) {

		return this.em.createNamedQuery(Tarea.FIND_BY_ID, Tarea.class)
				.setParameter(Tarea.PARAM_ID, id)
				.getSingleResult();
	}

}
