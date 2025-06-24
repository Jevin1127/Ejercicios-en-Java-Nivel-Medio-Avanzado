create database mitabla1;

use mitabla1;

create table guitarra (
   idGuitarra int not null,
   guitarraMarca varchar(45) default null,
   guitarraModelo varchar(45) default null,
   guitarraProveedor varchar(45) default null,
   tipoGuitarra varchar(45) default null,
   primary key(idGuitarra)
);

Select * from guitarra;