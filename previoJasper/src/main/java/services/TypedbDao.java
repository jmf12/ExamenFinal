package services;

import models.Typedb;
import util.Conexion;

public class TypedbDao extends Conexion<Typedb> implements GenericDao<Typedb>{
	
	public TypedbDao(){
		super(Typedb.class);
	}

}