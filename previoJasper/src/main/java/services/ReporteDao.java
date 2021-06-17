package services;

import models.Reporte;
import util.Conexion;

public class ReporteDao extends Conexion<Reporte> implements GenericDao<Reporte>{
	
	public ReporteDao(){
		super(Reporte.class);
	}

}