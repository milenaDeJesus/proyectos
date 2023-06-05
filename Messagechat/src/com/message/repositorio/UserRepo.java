package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Usuario;

public class UserRepo {

private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UserRepo() {
		usuarios.add(new Usuario(1, "Berenice", "Bastidas", "bereniceb", "https://cdn-icons-png.flaticon.com/512/9048/9048537.png", "berenice123", "Conectado"));
		usuarios.add(new Usuario(2, "Alexis", "Anchaluisa", "alexisa", "https://cdn-icons-png.flaticon.com/512/5294/5294700.png", "alexis123", "Conectado"));
		usuarios.add(new Usuario(3, "Melanie", "Panta", "melaniep", "https://cdn-icons-png.flaticon.com/512/9048/9048475.png", "mealine123", "Desconectado"));
		usuarios.add(new Usuario(4, "Alisson", "Hernandez", "alissonh", "https://cdn-icons-png.flaticon.com/512/9048/9048588.png", "alisson123", "Conectado"));
		usuarios.add(new Usuario(5, "Pedro", "Pacheco", "pedrop", "https://cdn-icons-png.flaticon.com/512/9048/9048410.png", "pedro123", "Desconectado"));
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario userId(int id) {
		for(Usuario user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public Usuario userName(String username) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public Usuario password(String username, String clave) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
	
}
