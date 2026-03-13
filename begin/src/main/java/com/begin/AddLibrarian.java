package com.begin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddLibrarian extends Application {
   private static Scene scene ;
   @Override
   public void start(Stage stage)throws Exception{
       Text title = new Text("ADD_LIBRARIAN");
       title.setX(100);
       title.setY(40) ;

        TextField[] addLib = new TextField[3];
        Label[] labels = new Label[3];

        String[] labelTexts = {
                "Enter LIBRARIAN_id",
                "Enter LIBRARIAN_name",
                "Enter LIBRARIAN_Password"
        };

        VBox form = new VBox(12);
        form.getChildren().add(title);
        form.setPadding(new Insets(20));
        form.setMaxWidth(600);
       // form.setBackground(Color.MAROON);
       //form.setStyle("-fx-background-color: teal;");

       for (int i = 0; i < 3; i++) {
            labels[i] = new Label(labelTexts[i]);
            labels[i].setTextFill(Color.WHEAT);
            addLib[i] = new TextField();
            VBox row = new VBox(5, labels[i], addLib[i]);
            form.getChildren().add(row);
        }


        Button btn = new Button("ADD_LIBRARIAN");
        btn.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-padding: 10px 20px;");
        form.getChildren().add(btn);

        Button backbtn = new Button("Librarian Dashboard") ;
        backbtn.setStyle("-fx-background-color: gray; -fx-text-fill: white; -fx-padding: 10px 20px;");
        form.getChildren().add(backbtn) ;
        backbtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                LibrarianMainMenu librarianMainMenu = new LibrarianMainMenu();
                try {
                    librarianMainMenu.start(stage);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });


        btn.setOnAction((ActionEvent e) -> {
            String []student = new String[]{
                    addLib[0].getText(),
                    addLib[1].getText(),     
                    addLib[2].getText(),
            };    
           LibrarianDAO.createlib(student);     
            
        });
        VBox root = new VBox();
        root.getChildren().add(form);
        root.setStyle("-fx-background-color: #e79c4cff;");
        scene = new Scene(root, 500, 600);
        scene.setFill(Color.RED);
        stage.setTitle("Add Student");
        stage.setScene(scene);
        stage.show();
   }
   
}
