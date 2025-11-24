package com.begin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddStudent extends Application {

    private static Scene scene ;
    @Override
    public void start(Stage stage) throws Exception {
       Text title = new Text("ADD_STUDENT");
       title.setX(100);
       title.setY(40) ;

        TextField[] addStudent = new TextField[7];
        Label[] labels = new Label[7];

        String[] labelTexts = {
                "Enter Student_id",
                "Enter Student_name",
                "Enter Student_Dept",
                "Enter Student_email",
                "Enter Student_Batch",
                "Enter Student_Password", 
                "Enter Student_Phone_Number"
        };

        VBox form = new VBox(12);
        form.getChildren().add(title);
        form.setPadding(new Insets(20));
        form.setMaxWidth(600);
       // form.setBackground(Color.MAROON);
       //form.setStyle("-fx-background-color: teal;");

       for (int i = 0; i < 7; i++) {
            labels[i] = new Label(labelTexts[i]);
            labels[i].setTextFill(Color.WHEAT);
            addStudent[i] = new TextField();
            VBox row = new VBox(5, labels[i], addStudent[i]);
            form.getChildren().add(row);
        }


        Button btn = new Button("ADD_Student");
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
                    addStudent[0].getText(),
                    addStudent[1].getText(),     
                    addStudent[2].getText(),
                    addStudent[3].getText(),
                    addStudent[4].getText(),
                    addStudent[5].getText(),
                    addStudent[6].getText()
            };    
           StudentDAO.addStudent(student);     
            
        });
        VBox root = new VBox();
        root.getChildren().add(form);
        root.setStyle("-fx-background-color: #e65f2aff;");
        scene = new Scene(root, 500, 600);
        scene.setFill(Color.RED);
        stage.setTitle("Add Student");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
