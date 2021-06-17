package services;

import models.Rol;
import util.Conexion;

public class RolDao extends Conexion<Rol> implements GenericDao<Rol>{
	
	public RolDao(){
		super(Rol.class);
	}

}