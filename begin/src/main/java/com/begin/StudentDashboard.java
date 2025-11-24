package com.begin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StudentDashboard extends Application{
    private static Scene scene ;
    @Override
    public void start(Stage stage) throws Exception {
          Button b1 = new Button("VIEW BOOK");
          b1.setLayoutX(540);
          b1.setLayoutY(200); 
          b1.addEventHandler(ActionEvent.ACTION, e->{
            AllViewsTable allViewsTable = new AllViewsTable() ;
            try {
                allViewsTable.start(stage) ;
            } catch (Exception ex) {
                ex.getMessage() ;
            }
          });
          Button b2 = new Button(" ISSUED BOOK") ;
          b2.setLayoutX(300);
          b2.setLayoutY(500);
          b2.addEventHandler(ActionEvent.ACTION, e->{
              IssueBook issueBook = new IssueBook() ;
              try {
                  issueBook.start(stage);
              } catch (Exception ex) {
                  ex.getMessage();
              }
          });
          Button b3 = new Button(" RETURN BOOK");
          b3.setLayoutX(520);    
          b3.setLayoutY(550);
          b3.addEventHandler(ActionEvent.ACTION, e->{
              ReturnBook returnBook = new ReturnBook() ;
              try {
                  returnBook.start(stage);
              } catch (Exception ex) {
                  ex.getMessage();
              }
          });
          Button b4 = new Button("Renew Book") ;
          b4.setLayoutX(440);
          b4.setLayoutY(350);
          b4.addEventHandler(ActionEvent.ACTION, e->{
              RenewBook renewBook = new RenewBook() ;
              try {
                  renewBook.start(stage);
              } catch (Exception ex) {
                  ex.getMessage();
              }
          });
          Button b5 = new Button("Main Menu") ;
            b5.setLayoutX(520);
            b5.setLayoutY(300);
            b5.addEventHandler(ActionEvent.ACTION, e->{
                MAinMenu mainMenu = new MAinMenu() ;
                try {
                    mainMenu.start(stage);
                } catch (Exception ex) {
                    ex.getMessage();
                }
            });
            Image img = new Image(getClass().getResource("StuentPanel.jpg").toExternalForm());
        BackgroundImage backgroundImg = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(400, 400, true, true, true, true)
        );  
          Pane pane = new Pane();
          pane.getChildren().addAll(b1,b2,b3,b4,b5);
          pane.setPrefSize(400, 400);
          pane.setBackground(new javafx.scene.layout.Background(backgroundImg));
          scene = new Scene (pane,400,400);
          stage.setTitle("Student Dashboard");
          stage.setScene(scene);
          stage.show();   
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
