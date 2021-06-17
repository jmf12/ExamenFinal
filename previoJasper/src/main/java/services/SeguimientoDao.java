package services;

import models.Seguimiento;
import util.Conexion;
 
public class SeguimientoDao extends Conexion<Seguimiento> implements GenericDao<Seguimiento>{
	
	public SeguimientoDao(){
		super(Seguimiento.class);
	}

}
