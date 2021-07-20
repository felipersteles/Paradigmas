package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertSenha {
	
	public static void showAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("AVISO!");
		alert.setHeaderText("SENHA INCORRETA!");
		alert.setContentText("TENTE NOVAMENTE!");
		alert.show();
	}
	
}