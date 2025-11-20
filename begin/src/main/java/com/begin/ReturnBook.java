package com.begin;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ReturnBook extends Application {
    private static Scene scene ;
    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text("Return Book Page");
        text.setX(300) ;
        text.setY(20) ;
        text.setFont(new Font ("Corbel Light", 24));

        Label label = new Label("Enter Book ID");
        TextField tf = new TextField();
        tf.setPromptText("GY_|_|_|_|_|");
        Button btn = new Button("Return Book");
        btn.setOnAction(e->{
           
               System.out.println("Want Email Receipt:Yes / No");
               Scanner sc = new Scanner(System.in);
               String choice = sc.nextLine();
               if(choice.equalsIgnoreCase("yes")){
                   System.out.println("Email Receipt Sent Successfully");
               }
               else{
                   System.out.println("Book\t" + tf.getText() +"\tReturned Successfully :)");
               }   
               tf.setText("") ;
        });
        btn.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-padding: 10px 20px;");

        VBox root = new VBox(12);
        root.getChildren().addAll(text,label,tf , btn) ;
        Scene scene = new Scene(root,600,400);
        root.setStyle("-fx-background-color: #ca62a4ff;");
        stage.setTitle("Return Book");
        stage.setScene(scene);  
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }

}
