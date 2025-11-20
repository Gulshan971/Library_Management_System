package com.begin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Entrance extends Application {

    private static Scene scene ;
    
    @Override
    public void start(Stage stage)throws Exception{
       Rectangle rect1= new Rectangle(100,100,200,150);
       rect1.setFill(Color.BEIGE);
       Text text1= new Text(150,200,"Hello JavaFX");
       StackPane root = new StackPane();
         root.getChildren().addAll(rect1,text1);
         scene = new Scene(root,600,400,Color.AQUA);
         stage.setTitle("My First JavaFX App");
         stage.setScene(scene);  
         stage.show(); 
    } 

    public static void main(String[] args) {
        launch(args);
    }

  
}
