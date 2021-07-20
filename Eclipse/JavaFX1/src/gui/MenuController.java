package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuController {
	@FXML
	private Button Ingresso;

	@FXML
	private Button Consulta;
	
	@FXML
	public void onConsultaWindow(ActionEvent event) {
		Parent login;
		try {
			login = FXMLLoader.load(getClass().getResource("/gui/Login.fxml"));
			Stage stage = new Stage();
			stage.setTitle("LOGIN");
			stage.setScene(new Scene(login));
			stage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void onIngressoWindow(ActionEvent event) {
		Parent ingresso;
		try {
			ingresso = FXMLLoader.load(getClass().getResource("/gui/Salas.fxml"));
			Stage stage = new Stage();
			stage.setTitle("SALAS DISPONIVEIS");
			stage.setScene(new Scene(ingresso));
			stage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
