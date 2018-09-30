package com.codeicus.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema="maestro", name="tarea")
@NamedQueries({
	@NamedQuery(name=Tarea.FIND_ALL, query="from Tarea t"),
	@NamedQuery(name=Tarea.FIND_BY_ID, query="from Tarea t where id = :" + Tarea.PARAM_ID)
})
public class Tarea implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "findAll";
	public static final String FIND_BY_ID = "findById";
	public static final String PARAM_ID = "id";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="es_urgente")
	private Boolean esUrgente;
	
	@Column(name="fecha_alta")
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	@Column(name="fecha_estimada_finalizacion")
	@Temporal(TemporalType.DATE)
	private Date fechaEstimadaFinalizacion;
	
	@Column(name="fecha_finalizacion")
	@Temporal(TemporalType.DATE)
	private Date fechaFinalizacion;
	
	@Column(name="fecha_update")
	@Temporal(TemporalType.DATE)
	private Date fechaUpdate;

	@Column(name="deleted")
	private Boolean deleted;
	
	@Column(name="fecha_delete")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDelete;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEsUrgente() {
		return esUrgente;
	}

	public void setEsUrgente(Boolean esUrgente) {
		this.esUrgente = esUrgente;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaEstimadaFinalizacion() {
		return fechaEstimadaFinalizacion;
	}

	public void setFechaEstimadaFinalizacion(Date fechaEstimadaFinalizacion) {
		this.fechaEstimadaFinalizacion = fechaEstimadaFinalizacion;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public Date getFechaUpdate() {
		return fechaUpdate;
	}

	public void setFechaUpdate(Date fechaUpdate) {
		this.fechaUpdate = fechaUpdate;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Date getFechaDelete() {
		return fechaDelete;
	}

	public void setFechaDelete(Date fechaDelete) {
		this.fechaDelete = fechaDelete;
	}

}
