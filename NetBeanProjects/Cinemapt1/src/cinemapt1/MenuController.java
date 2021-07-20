package cinemapt1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {
	@FXML
	private Button compraIngresso;

	@FXML
	private Button Consulta;
	
	@FXML
	public void onConsultaAction() {
		System.out.println("Cont:");
	}
	
	@FXML
	public void onTesteAction() {
		System.out.println("TESTE");

	}
	
	@FXML
	public void onTesteWindow(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/gui/Consulta.fxml"));
			Stage stage = new Stage();
			stage.setTitle("CONSULTA.");
			stage.setScene(new Scene(root));
			stage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
