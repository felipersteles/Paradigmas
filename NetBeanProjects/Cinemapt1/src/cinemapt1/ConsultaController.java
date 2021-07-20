package cinemapt1;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConsultaController {
	
	@FXML
	private Button Sala1;
	@FXML
	private Button Sala2;
	
	
	@FXML
	public void onSala1Window(ActionEvent event) throws FileNotFoundException {
		Text titulo = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(0);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	         System.out.println("EDITOU");  
	         } 
	    }));
	    remove.setOnMouseClicked((new EventHandler<MouseEvent>(){
	    	public void handle(MouseEvent event) {
	    		System.out.println("REMOVEU");
	    	}
	    }));
		imageView.setX(50); 
	    imageView.setY(80);
	    imageView.setFitHeight(250); 
	    imageView.setFitWidth(168.75); 
	    imageView.setPreserveRatio(true);  
	    capacidade.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 20));
	    capacidade.setText("Lugares dispon�veis:" + sala.findCapacidade(0));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(0));
		titulo.setX(50); 
	    titulo.setY(50);
		Group root = new Group(titulo, imageView, editar, remove, capacidade);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA 1");
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
		
	}
	
	@FXML
	public void onSala2Window(ActionEvent event) throws FileNotFoundException {
		Text titulo = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(1);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	         System.out.println("EDITOU");  
	         } 
	    }));
	    remove.setOnMouseClicked((new EventHandler<MouseEvent>(){
	    	public void handle(MouseEvent event) {
	    		System.out.println("REMOVEU");
	    	}
	    }));
		imageView.setX(50); 
	    imageView.setY(80);
	    imageView.setFitHeight(250); 
	    imageView.setFitWidth(168.75); 
	    imageView.setPreserveRatio(true);  
	    capacidade.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 20));
	    capacidade.setText("Lugares dispon�veis:" + sala.findCapacidade(1));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(1));
		titulo.setX(50); 
	    titulo.setY(50);
		Group root = new Group(titulo, imageView, editar, remove, capacidade);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA:" + sala.findSala(1));
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
		
	}
	
	
}
