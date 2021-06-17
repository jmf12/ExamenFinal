package services;

import models.Usuario;
import util.Conexion;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario> {

	public UsuarioDao() { 
		super(Usuario.class);
	}

	public String iniciarSesion(String usu, String clave) {

		Usuario usuario;

		if (clave != "") {

			if (find(usu) != null) {

				usuario = find(usu);

				if (usuario.getPass().equals(clave) && usuario.getState() == 1) {

					return "SUCCESS";

				} else {
					return "Contraseña Incorrecta";
				}

			} else {
				return "El Usuario no se encuentra registrado";
			}
		} else {
			return "Debe Completar Todos Los Campos";
		}
	}
	
}
