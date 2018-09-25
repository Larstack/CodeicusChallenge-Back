--createdb codeicus_tareas_db
--createuser -s -P -e codeicus

create schema maestro;

create table maestro.tarea(

	id serial,
	titulo varchar(100) not null,
	descripcion varchar(500) not null, 
	es_urgente boolean not null default false,
	fecha_alta timestamp not null default now(),
	fecha_estimada_finalizacion date null,
	fecha_finalizacion timestamp null,
	fecha_update timestamp null,
	fecha_delete timestamp null,
	deleted boolean not null default false
);