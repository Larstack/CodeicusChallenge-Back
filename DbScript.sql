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

select * from maestro.tarea;

insert into maestro.tarea(titulo,descripcion,es_urgente,fecha_estimada_finalizacion) values
('Este es el titulo 1','Esta es la descripcion de 1', true, '2018-10-13'::date),
('Este es el titulo 2','Esta es la descripcion de 2', false, '2018-11-14'::date);
