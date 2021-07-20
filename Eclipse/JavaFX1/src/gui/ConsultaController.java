package gui;

import java.io.FileNotFoundException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ConsultaController {
	
	private int spec1, spec2, spec3, spec4;
	private boolean status1, status2, status3, status4;
	
	@FXML
	private Button Sala1;
	@FXML
	private Button Sala2;
	@FXML
	private Button Sala3;
	@FXML
	private Button Sala4;
	
	
	@FXML
	public void onSala1Window(ActionEvent event) throws FileNotFoundException {
		if(status1==false) {
			spec1 = 0;
		}
		Text titulo = new Text();
		Text Data = new Text();
		Text Prox = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(spec1);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    remove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	     		Text Filmes = new Text("Qual filme quer colocar nessa Sala?:");
	     		ChoiceBox filmesChoiceBox = new ChoiceBox(); 
	     	    filmesChoiceBox.getItems().addAll
	     	         (sala.findNome(0), sala.findNome(1), sala.findNome(2), sala.findNome(3));
	     	    Filmes.setLayoutX(20);
	     	    Filmes.setLayoutY(90);
	     	    Filmes.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 12));
	     	    filmesChoiceBox.setLayoutX(20);
	     	    filmesChoiceBox.setLayoutY(100);
	     	    Group root = new Group(Filmes, filmesChoiceBox);
	     	    Stage stage = new Stage();
	     	    stage.setTitle("EDITAR");
	     		stage.setScene(new Scene(root, 300, 200, Color.ORANGE));
	     		stage.show();
	     		filmesChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	     		      @Override
	     		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
	     		    	  System.out.println(filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  int aux;
	     		    	  int i = 0;
	     		    	  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  while(sala.findNome(i)!=null) {
	     		    		  if(aux==0) {
	     		    			  System.out.println("Resultado: " + sala.findNome(i));
	     		    			  spec1 = i;
	     		    			  status1 = true;
	     		    			  break;
		     		       		}
	     		    		  else {
	     		    			  i++;
	     		    			  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    		  }
	     		    	  }
	     		      }
	     		});

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
	    capacidade.setText("Lugares disponíveis:" + sala.findCapacidade(spec1));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(spec1));
		titulo.setX(50); 
	    titulo.setY(50);
	    Data.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 13));
	    Data.setText("Sessão atual: \n" + sala.findData1(spec1) + "\n -------------------------------------------");
	    Data.setX(250);
	    Data.setY(200);
	    Prox.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 13));
	    Prox.setText("Prox Sessão: \n" + "Filme: " + sala.findNome(2) + "\nás: " + sala.findData1(2) + "\n -------------------------------------------");
	    Prox.setX(250);
	    Prox.setY(250);
		Group root = new Group(titulo, imageView, editar, remove, capacidade, Data, Prox);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA 1");
		stage.setScene(new Scene(root, 600, 400, Color.ORANGE));
		stage.show();
		
	}
	
	@FXML
	public void onSala2Window(ActionEvent event) throws FileNotFoundException {
		if(status2==false) {
			spec2 = 1;
		}
		Text titulo = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(spec2);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    remove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() {
	    	
	         public void handle(MouseEvent event) {
	     		Text Filmes = new Text("Qual filme quer colocar nessa Sala?:");
	     		ChoiceBox filmesChoiceBox = new ChoiceBox(); 
	     	    filmesChoiceBox.getItems().addAll
	     	         (sala.findNome(0), sala.findNome(1), sala.findNome(2), sala.findNome(3));
	     	    Filmes.setLayoutX(20);
	     	    Filmes.setLayoutY(90);
	     	    Filmes.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 12));
	     	    filmesChoiceBox.setLayoutX(20);
	     	    filmesChoiceBox.setLayoutY(100);
	     	    Group root = new Group(Filmes, filmesChoiceBox);
	     	    Stage stage = new Stage();
	     	    stage.setTitle("EDITAR");
	     		stage.setScene(new Scene(root, 300, 200, Color.ORANGE));
	     		stage.show();
	     		filmesChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	     		      @Override
	     		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
	     		    	  System.out.println(filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  int aux;
	     		    	  int i = 0;
	     		    	  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  while(sala.findNome(i)!=null) {
	     		    		  if(aux==0) {
	     		    			  System.out.println("Resultado: " + sala.findNome(i));
	     		    			  spec2 = i;
	     		    			  status2 = true;
	     		    			  break;
		     		       		}
	     		    		  else {
	     		    			  i++;
	     		    			  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    		  }
	     		    	  }
	     		      }
	     		});

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
	    capacidade.setText("Lugares disponíveis:" + sala.findCapacidade(spec2));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(spec2));
		titulo.setX(50); 
	    titulo.setY(50);
		Group root = new Group(titulo, imageView, editar, remove, capacidade);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA 2");
		stage.setScene(new Scene(root, 600, 400, Color.ORANGE));
		stage.show();
		
	}
	
	@FXML
	public void onSala3Window(ActionEvent event) throws FileNotFoundException {
		if(status3==false) {
			spec3 = 2;
		}
		Text titulo = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(spec3);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    remove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	     		Text Filmes = new Text("Qual filme quer colocar nessa Sala?:");
	     		ChoiceBox filmesChoiceBox = new ChoiceBox(); 
	     	    filmesChoiceBox.getItems().addAll
	     	         (sala.findNome(0), sala.findNome(1), sala.findNome(2), sala.findNome(3));
	     	    Filmes.setLayoutX(20);
	     	    Filmes.setLayoutY(90);
	     	    Filmes.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 12));
	     	    filmesChoiceBox.setLayoutX(20);
	     	    filmesChoiceBox.setLayoutY(100);
	     	    Group root = new Group(Filmes, filmesChoiceBox);
	     	    Stage stage = new Stage();
	     	    stage.setTitle("EDITAR");
	     		stage.setScene(new Scene(root, 300, 200, Color.ORANGE));
	     		stage.show();
	     		filmesChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	     		      @Override
	     		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
	     		    	  System.out.println(filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  int aux;
	     		    	  int i = 0;
	     		    	  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  while(sala.findNome(i)!=null) {
	     		    		  if(aux==0) {
	     		    			  System.out.println("Resultado: " + sala.findNome(i));
	     		    			  spec3 = i;
	     		    			  status3 = true;
	     		    			  break;
		     		       		}
	     		    		  else {
	     		    			  i++;
	     		    			  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    		  }
	     		    	  }
	     		      }
	     		});

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
	    capacidade.setText("Lugares disponíveis:" + sala.findCapacidade(spec3));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(spec3));
		titulo.setX(50); 
	    titulo.setY(50);
		Group root = new Group(titulo, imageView, editar, remove, capacidade);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA 4");
		stage.setScene(new Scene(root, 600, 400, Color.ORANGE));
		stage.show();
		
	}
	
	@FXML
	public void onSala4Window(ActionEvent event) throws FileNotFoundException {
		if(status4==false) {
			spec4 = 3;
		}
		Text titulo = new Text();
		Text capacidade = new Text();
		Sessao sala = new Sessao();
		Image image = sala.findImage(spec4);
		ImageView imageView = new ImageView(image);
		Button editar = new Button("Editar Filme em Cartaz");
		Button remove = new Button("Remover Filme em Cartaz");
		remove.setLayoutX(250);
		remove.setLayoutY(80);
		editar.setLayoutX(435); 
	    editar.setLayoutY(80);
	    editar.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    remove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
	    editar.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	     		Text Filmes = new Text("Qual filme quer colocar nessa Sala?:");
	     		ChoiceBox filmesChoiceBox = new ChoiceBox(); 
	     	    filmesChoiceBox.getItems().addAll
	     	         (sala.findNome(0), sala.findNome(1), sala.findNome(2), sala.findNome(3));
	     	    Filmes.setLayoutX(20);
	     	    Filmes.setLayoutY(90);
	     	    Filmes.setFont(Font.font("Tahoma",FontWeight.BOLD, FontPosture.REGULAR, 12));
	     	    filmesChoiceBox.setLayoutX(20);
	     	    filmesChoiceBox.setLayoutY(100);
	     	    Group root = new Group(Filmes, filmesChoiceBox);
	     	    Stage stage = new Stage();
	     	    stage.setTitle("EDITAR");
	     		stage.setScene(new Scene(root, 300, 200, Color.ORANGE));
	     		stage.show();
	     		filmesChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	     		      @Override
	     		      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
	     		    	  System.out.println(filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  int aux;
	     		    	  int i = 0;
	     		    	  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    	  while(sala.findNome(i)!=null) {
	     		    		  if(aux==0) {
	     		    			  System.out.println("Resultado: " + sala.findNome(i));
	     		    			  spec4 = i;
	     		    			  status4 = true;
	     		    			  break;
		     		       		}
	     		    		  else {
	     		    			  i++;
	     		    			  aux = sala.findNome(i).compareTo((String) filmesChoiceBox.getItems().get((Integer) number2));
	     		    		  }
	     		    	  }
	     		      }
	     		});

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
	    capacidade.setText("Lugares disponíveis:" + sala.findCapacidade(spec2));
	    capacidade.setX(250);
	    capacidade.setY(150);
		titulo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		titulo.setText(sala.findNome(spec4));
		titulo.setX(50); 
	    titulo.setY(50);
		Group root = new Group(titulo, imageView, editar, remove, capacidade);
		//root = FXMLLoader.load(getClass().getResource("/gui/Sala1.fxml"));
		Stage stage = new Stage();
		stage.setTitle("SALA 4");
		stage.setScene(new Scene(root, 600, 400, Color.ORANGE));
		stage.show();
		
	}
	
	
	
}
