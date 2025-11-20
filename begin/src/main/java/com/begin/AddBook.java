package com.begin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddBook extends Application {
    
  private static Scene scene ;  
  @Override
  public void start(Stage stage) throws Exception {
       // ---------- LEFT SIDE FORM ----------
        Text title = new Text("ADD_BOOK");

        TextField[] addBooks = new TextField[7];
        Label[] labels = new Label[7];

        String[] labelTexts = {
                "Enter Book_id",
                "Enter Book_author",
                "Enter Book_name",
                "Enter Book_price",
                "Enter Book_edition",
                "Enter Book_Isbn" ,
                "Enter Book_Number"
        };

        VBox form = new VBox(12);
        form.getChildren().add(title);
        form.setPadding(new Insets(20));
        form.setMaxWidth(300);
       // form.setBackground(Color.MAROON);
       form.setStyle("-fx-background-color: teal;");

        for (int i = 0; i < 7; i++) {
            labels[i] = new Label(labelTexts[i]);
            labels[i].setTextFill(Color.DARKKHAKI);
            addBooks[i] = new TextField();
            VBox row = new VBox(5, labels[i], addBooks[i]);
            form.getChildren().add(row);
        }


        Button btn = new Button("ADD_BOOK");
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
            System.out.println(
                    "Book_ID: " + addBooks[0].getText() + " | " +
                    "Author: " + addBooks[1].getText() + " | " +
                    "Name: " + addBooks[2].getText() + " | " +
                    "Price: " + addBooks[3].getText() + " | " +
                    "Edition: " + addBooks[4].getText() + " | " +
                    "Identical: " + addBooks[5].getText()
            );
        });


        // ---------- RIGHT SIDE PICTURE ----------
        Image bgImage = new Image(getClass().getResource("bookLib.jpg").toExternalForm());
        ImageView imgView = new ImageView(bgImage);
        imgView.setFitWidth(450);
        imgView.setPreserveRatio(true);

        VBox imageBox = new VBox(imgView);
        imageBox.setAlignment(Pos.CENTER);
        imageBox.setPadding(new Insets(20));


        // ---------- SIDE-BY-SIDE ----------
       HBox root = new HBox(40, form, imageBox);
        root.setPadding(new Insets(100));
        root.setAlignment(Pos.TOP_LEFT);

        scene = new Scene(root, 900, 700, Color.MEDIUMTURQUOISE);
        stage.setTitle("ADD Book");
        stage.setScene(scene);
        stage.show(); 
         
} 
       public static void main(String[] args){ 
       launch(args) ;
}
}