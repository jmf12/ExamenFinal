package services;

import models.Connectiontoken;
import util.Conexion;

public class ConnectiontokenDao extends Conexion<Connectiontoken> implements GenericDao<Connectiontoken> {

	public ConnectiontokenDao() {
		super(Connectiontoken.class);
	}

}