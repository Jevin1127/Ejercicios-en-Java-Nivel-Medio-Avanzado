Use lenguaje3;

CREATE TABLE lenguaje3.usuario (
  id 		int NOT NULL AUTO_INCREMENT,
  nombre 	varchar(60) DEFAULT NULL,
  contrasena 	varchar(20) DEFAULT NULL,
  email 		varchar(60) DEFAULT NULL,
  pais 		varchar(20) DEFAULT NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT=1;
