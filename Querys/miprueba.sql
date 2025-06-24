create database miprueba;

use miprueba;

create table guitarra (
   idGuitarra int not null,
   guitarraMarca varchar(45) default null,
   guitarraModelo varchar(45) default null,
   tipoCuerda int default null,
   primary key(idVehiculo)
);

Select * from guitarra;