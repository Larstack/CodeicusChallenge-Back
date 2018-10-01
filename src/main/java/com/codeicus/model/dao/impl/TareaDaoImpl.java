package com.codeicus.model.dao.impl;

import java.util.Date;
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

		if(tarea.getId() != null) {
			
			tarea.setFechaUpdate(new Date());
			this.em.merge(tarea);
		}
		else this.em.persist(tarea);
		if(tarea.getId() == null) System.out.println("nulo");;
	}

	@Override
	public void delete(Tarea tarea) {

//		BAJA LOGICA
		
		tarea.setFechaUpdate(new Date());
		tarea.setFechaDelete(new Date());
		tarea.setDeleted(true);
		
		this.em.merge(tarea);
	}

	@Override
	public List<Tarea> findAll() {

		List list = this.em.createNamedQuery(Tarea.FIND_ALL, Tarea.class).getResultList();
		
		return list;
	}

	@Override
	public Tarea findById(Integer id) {

		return this.em.createNamedQuery(Tarea.FIND_BY_ID, Tarea.class)
				.setParameter(Tarea.PARAM_ID, id)
				.getSingleResult();
	}

}
