package com.message.gui;

import com.message.dominio.Usuario;
import com.message.repositorio.UserRepo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Topdesign {
	
	private UserRepo usuario = new UserRepo();
	private Circle imagen;
	private Label nombre;
	private Label estado;
	private HBox topleft;
	private HBox topright;
	private Usuario user;
	
	public Topdesign(String username) {
		user =  usuario.userName(username);
		nombre = new Label(user.getNombre());
		imagen = new Circle(20);
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
	}
	
	public Topdesign() {
		imagen = new Circle(20);
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
		topright = new HBox(10);
		topright.setStyle("-fx-padding: 6px 10px 0 10px;\r\n"
				+ "	-fx-pref-height: 61px;\r\n"
				+ "	-fx-alignment: center-left;\r\n");
		topright.setAlignment(Pos.CENTER_LEFT);
	}

	public UserRepo getUsuario() {
		return usuario;
	}

	public void setUsuario(UserRepo usuario) {
		this.usuario = usuario;
	}

	public Circle getImagen() {
		return imagen;
	}

	public void setImagen(Circle imagen) {
		this.imagen = imagen;
	}

	public Label getNombre() {
		return nombre;
	}

	public void setNombre(Label nombre) {
		this.nombre = nombre;
	}

	public Label getEstado() {
		return estado;
	}

	public void setEstado(Label estado) {
		this.estado = estado;
	}
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public HBox getTopleft() {
		return topleft;
	}

	public void setTopleft(HBox topleft) {
		this.topleft = topleft;
	}

	public HBox getTopright() {
		return topright;
	}

	public void setTopright(HBox topright) {
		this.topright = topright;
	}

	public HBox topLeft() {
		imagen.setFill(new ImagePattern(new Image(user.getImagen())));
		topleft = new HBox(10, imagen, nombre);
		topleft.setAlignment(Pos.CENTER);
		return topleft;
	}
	
	public HBox topRight(int userId) {
		user =  usuario.userId(userId);
		nombre = new Label(user.getNombre());
		estado = new Label(user.getEstado());
		imagen.setFill(new ImagePattern(new Image(user.getImagen())));
		VBox vbox = new VBox(5, nombre, estado);
		topright.getChildren().addAll(imagen, vbox);
		return topright;
	}
	
	public void styles() {
		nombre.setStyle("-fx-font-family: 'Comic Sans Ms';\r\n"
				+ "	-fx-font-weight: bold;\r\n"
				+ "	-fx-font-size: 130%;\r\n"
				+ "	-fx-pref-width: 140px;\r\n"
				+ "	-fx-text-fill: black;");		
	}
}
