CREATE TABLE proyectofinal.Usuarios (
  id 		int NOT NULL AUTO_INCREMENT,
  codigo 	varchar(15) DEFAULT NULL,
  nombre 	varchar(60) DEFAULT NULL,
  contrasena 	varchar(20) DEFAULT NULL,
  email 		varchar(60) DEFAULT NULL,
  estatus 		boolean,
  PRIMARY KEY (id), 
  UNIQUE (codigo)
  )AUTO_INCREMENT=1;
  
  SELECT * FROM proyectofinal.Usuarios WHERE codigo = 'Jlopez' and estatus = 1
  
  UPDATE proyectofinal.Usuarios SET estatus = 1 WHERE codigo = 'Jlopez'
  
  DELETE FROM proyectofinal.Usuarios WHERE id = 3
  
  