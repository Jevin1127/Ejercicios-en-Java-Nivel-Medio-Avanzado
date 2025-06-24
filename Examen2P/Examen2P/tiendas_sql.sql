create database examen;
use examen;
create table tienda (
  IdTienda 		varchar(5),
  NomTienda 	varchar(20),
  DirTienda 	varchar(50) default null,
  primary key (IdTienda)
);
/*Otras consultas*/
select * from tienda;

insert into tienda (IdTienda, NomTienda, DirTienda)
		values('TDA01', 'TIENDA COMAYAGUELA', '5TA. AVENIDA, COMAYAGUELA, M.D.C.');


