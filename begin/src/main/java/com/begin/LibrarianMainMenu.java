package com.begin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
// import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibrarianMainMenu extends Application{
    private static Scene scene ;

    @Override
    public void start(Stage stage)throws Exception{
        // Image bgImage = new Image(getClass().getResource("Librarian.png").toExternalForm());
        // ImageView imgView = new ImageView(bgImage);
        // imgView.setFitWidth(450);
        // imgView.setPreserveRatio(true);
       
        Button b1 = new Button("ADD BOOK");
        b1.setLayoutX(50);
        b1.setLayoutY(100); 
        b1.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                AddBook addBook = new AddBook();
                try {
                    addBook.start(stage);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });
        
        b1.setStyle("--fx-backgroundcolor : maroon");
        Button b2 = new Button("VIEW BOOK");
        b2.setLayoutX(50);
        b2.setLayoutY(150); 
        b2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                AllViewsTable allViewsTable = new AllViewsTable() ;
                try {
                    allViewsTable.start(stage) ;
                } catch (Exception e) {
                }
            }
        });
        Button b3 = new Button("ADD STUDENT");
        b3.setLayoutX(50);
        b3.setLayoutY(200);
        b3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                AddStudent addStudent = new AddStudent();
                try {
                    addStudent.start(stage);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });
        Button b4 = new Button("ISSUE BOOK");   
        b4.setLayoutX(50);
        b4.setLayoutY(250);
        Button b5 = new Button("RETURN BOOK");
        b5.setLayoutX(50);
        b5.setLayoutY(300);
        Button b6 = new Button("Main Menu");
        b6.setLayoutX(150);
        b6.setLayoutY(350);
        b6.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                MAinMenu mainMenu = new MAinMenu();
                try {
                    mainMenu.start(stage);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });
        // imgView.setPreserveRatio(true);
        // imgView.setFitHeight(400);  
        VBox menuBox = new VBox(10, b1, b2, b3, b4, b5, b6);
        menuBox.setLayoutX(110);
        menuBox.setLayoutY(180);
        Pane root = new Pane();
        root.getChildren().addAll(menuBox);
       // root.setAlignment(Pos.BOTTOM_LEFT);
        Image img = new Image(getClass().getResource("Librarian.png").toExternalForm());
        BackgroundImage backgroundImg = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(600, 400, true, true, true, true)
        );

        root.setBackground(new Background(backgroundImg));
        root.setMaxWidth(150);
        scene = new Scene(root,600,400);

        stage.setTitle("Librarian Main Menu");  
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
