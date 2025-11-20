package com.begin;

import java.time.LocalDate;
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

public class RenewBook extends Application {
    private static Scene scene ;
    @Override
    public void start(Stage stage) throws Exception {
       Text text = new Text("Renew Book Page");
         text.setX(300) ;
         text.setY(20) ;
         text.setFont(new Font ("Corbel Light", 24));
         Label label = new Label("Enter Book ID");
         TextField tf = new TextField();
         tf.setPromptText("GY_|_|_|_|_|");
         Label label1 = new Label("Enter Student ID");
        TextField tf1 = new TextField();
         tf1.setPromptText("ST_|_|_|_|_|");
         Button btn = new Button("Renew Book");
         btn.setOnAction(e->{
            
                System.out.println("Want Email Receipt:Yes / No");
                Scanner sc = new Scanner(System.in);
                String receipt = sc.nextLine();
                if(receipt.equalsIgnoreCase("Yes")){
                    System.out.println("Email Receipt Sent Successfully");
                }
                else{
                    System.out.println("Book\t" + tf.getText() +"\tIssued Successfully :)");
                    LocalDate dueDate = LocalDate.now().plusDays(14);
                    System.out.println("Book Due Date is: " + dueDate);
                }   
                tf.setText("") ;
                tf1.setText("") ;

         });
         btn.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-padding: 10px 20px;");
         Button backbtn = new Button("Student Dashboard") ;
         backbtn.setStyle("-fx-background-color: purple; -fx-text-fill: white; -fx-padding: 10px 20px;");
         backbtn.setOnAction(e -> {
             try {
                 StudentDashboard sd = new StudentDashboard();
                 sd.start(stage);
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
         });
         VBox root = new VBox(12);
         root.getChildren().addAll(text,label,tf,label1,tf1 , btn ,backbtn) ;
         Scene scene = new Scene(root,600,400);
         root.setStyle("-fx-background-color: #ca62a4ff;");
         stage.setTitle("Issue Book");
         stage.setScene(scene);  
         stage.show();  
         




    }

    public static void main(String[] args) {
        launch(args);
    }
        
    }

