package com.message.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class Rightdesign {
	
	private HBox rightdesign;
	private Circle imagen;
	private Label mensaje;
	private Label fecha;
	
	public Rightdesign() {
		rightdesign = new HBox(10);
		mensaje = new Label();
		fecha = new Label();
	}
	
	public HBox getRightdesign() {
		return rightdesign;
	}
	
	public void setRightdesign(HBox rightdesign) {
		this.rightdesign = rightdesign;
	}

	public Circle getImagen() {
		return imagen;
	}

	public void setImagen(Circle imagen) {
		this.imagen = imagen;
	}

	public Label getMensaje() {
		return mensaje;
	}

	public void setMensaje(Label mensaje) {
		this.mensaje = mensaje;
	}

	public Label getFecha() {
		return fecha;
	}

	public void setFecha(Label fecha) {
		this.fecha = fecha;
	}
	
	public void messageUser(String foto, String message) {
		mensaje.setText(message);
		VBox vbox = new VBox(5, mensaje, fecha);
		vbox.setStyle("-fx-padding: 12px 11px 12px 11px;\r\n"
				+ "	-fx-background-color: rgba(80, 194, 199, 0.8);\r\n"
				+ "	-fx-max-width: 350px;");
		rightdesign.setAlignment(Pos.CENTER_RIGHT);
		rightdesign.getChildren().addAll(vbox);
	}
	
	public void messageContact(String foto, String message) {
		mensaje.setText(message);
		VBox vbox = new VBox(5, mensaje, fecha);
		vbox.setStyle("-fx-padding: 11px 10px 11px 10px;\r\n"
				+ "	-fx-background-color: rgba(168, 221, 207, 0.8);\r\n"
				+ "	-fx-max-width: 350px;");
		rightdesign.setAlignment(Pos.CENTER_LEFT);
		rightdesign.getChildren().addAll(vbox);
	}
	
	public void styles() {
		rightdesign.setStyle("-fx-padding: 15px 5px 15px 5px;\r\n"
				+ "	-fx-pref-width: 693px;");
		
		mensaje.setStyle("-fx-font-family: 'Arial';\r\n"
				+ "	-fx-text-alignment: justify;\r\n"
				+ "	-fx-max-width: 300px;\r\n"
				+ "	-fx-wrap-text: true;\r\n"
				+ "	-fx-font-size: 100%");
	}

}
