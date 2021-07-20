package gui;

import java.io.IOException;

import gui.util.AlertSenha;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {
	
	private boolean senhacorreta = false;
	
	
	@FXML
	private Button entrar;
	@FXML
	private Button sair;
	
	@FXML
	private TextField login;
	@FXML
	private PasswordField senha;
	
	@FXML
	public void onEntrarWindow(ActionEvent event) {

		login.setId(null);
        senha.setId(null);
			
			
		if(login.getText().equals("admin") && senha.getText().equals("admin"))
			senhacorreta = true;
		
		else
			AlertSenha.showAlert();
		
		if(senhacorreta == true) {
			Parent catalogo;
			try {
				catalogo = FXMLLoader.load(getClass().getResource("/gui/Consulta.fxml"));
				Stage stage = new Stage();
				stage.setTitle("FILMES");
				stage.setScene(new Scene(catalogo));
				stage.show();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			Stage stage = (Stage) sair.getScene().getWindow(); //Obtendo a janela atual
		    stage.close(); //Fechando o Stage
		}
	}
	
	@FXML
	private void fecharTelaAction(){
		Stage stage = (Stage) sair.getScene().getWindow(); //Obtendo a janela atual
	    stage.close(); //Fechando o Stage
	}

}
