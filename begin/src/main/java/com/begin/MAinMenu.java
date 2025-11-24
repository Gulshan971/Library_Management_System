package com.begin;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.* ;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.* ;


public class MAinMenu extends Application {
  
private static Scene scene ;
    
  @Override 
  public void start(Stage stage)throws Exception{ 
    Ellipse ellipse = new Ellipse() ; 
    ellipse.setCenterX(125); 
    ellipse.setCenterY(200); 
    ellipse.setRadiusX(85.2f); 
    ellipse.setRadiusY(62.5f) ; 
    Text text = new Text("WELCOME TO LIBRARY") ; 
    text.setFont(Font.font("Arial" , 10)); 
    /*setTittle property doen not support by Ellipse   
    StackPane st = new StackPane(ellipse , text) ;*/ 
    Stop[] stop = new Stop[]{ 
      new Stop(0 , Color.YELLOW) , 
     // new Stop(1 , Color.GOLD) , 
      new Stop(1 , Color.ORCHID)  
    } ; 
    LinearGradient lg = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE, stop) ; 
    ellipse.setFill(lg) ; 
     
    Arc arc = new Arc() ; 
    arc.setCenterX(450); 
    arc.setCenterY(300) ; 
    arc.setRadiusX(430) ; 
    arc.setRadiusY(520) ; 
    arc.setStartAngle(50); 
    arc.setLength(30) ; 
    arc.setType(ArcType.CHORD) ; 
    arc.setFill(Color.DARKSALMON) ; 
 
    Button rect1 = new Button("Librarian Login") ; 

    // Button size
    rect1.setPrefSize(500, 100);   // preferred size (best for buttons)
    rect1.setMaxSize(500, 100);

   // Styling the button
   rect1.setStyle(
    "-fx-background-color: linear-gradient(to right,#32ac12 ,#b23c23 , #12ac54);" +
    "-fx-background-radius: 20;" +    // rounded corners
    "-fx-text-fill: white;" +         // text color
    "-fx-font-size: 40px;" +          // text size
    "-fx-font-family: 'Palace Script MT';"
  );

// Make mouse cursor a hand pointer
  rect1.setCursor(Cursor.OPEN_HAND);
     
    rect1.setOnAction( e-> { 
        LibrarianLogin librarianLogin = new LibrarianLogin() ; 
        try {
            librarianLogin.start(stage) ;
            //stage.close() ;
        } catch (Exception ex) {
            ex.getMessage() ;
        }
    }) ;
 
   
    //L//inearGradient lg2 = new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE, stop) ; 
    //r//ect1.setFill(lg2) ;
  
    Button rect2 = new Button("Student Login") ; 
    // Button size
    rect2.setPrefSize(500, 100);   // preferred size (best for buttons)
    rect2.setMaxSize(500, 100);

// Styling the button
   rect2.setStyle(
    "-fx-background-color: #43bcac;" +
    "-fx-background-radius: 20;" +    // rounded corners
    "-fx-text-fill: white;" +         // text color
    "-fx-font-size: 40px;" +          // text size
    "-fx-font-family: 'Palace Script MT';"
);

// Make mouse cursor a hand pointer
  rect2.setCursor(Cursor.HAND);
     
   
    rect2.setOnAction(  e-> { 
        StudentLogin studentLogin = new StudentLogin() ; 
        try {
            studentLogin.start(stage) ;
            //stage.close() ;
        } catch (Exception ex) {
            ex.getMessage() ;
        }
    }) ;

 
    Button rect3 = new Button("Librarian Logout") ; 

    // Button size
    rect3.setPrefSize(500, 100);   // preferred size (best for buttons)
    rect3.setMaxSize(500, 100);

  // Styling the button
   rect3.setStyle(
    "-fx-background-color: #3e7fcfff;" +
    "-fx-background-radius: 20;" +    // rounded corners
    "-fx-text-fill: white;" +         // text color
    "-fx-font-size: 40px;" +          // text size
    "-fx-font-family: 'Palace Script MT';"
);

// Make mouse cursor a hand pointer
  rect2.setCursor(Cursor.CLOSED_HAND);
     
    rect3.setOnAction( e->
      {
        LibrarianLogin librarianLogin = new LibrarianLogin() ; 
        try {
            librarianLogin.start(stage) ;
            //stage.close() ;
        } catch (Exception ex) {
            ex.getMessage() ;
        }
      }
    );
 
    Ellipse ellipse2 = new Ellipse() ; 
    ellipse2.setCenterX(150); 
    ellipse2.setCenterY(200); 
    ellipse2.setRadiusX(80); 
    ellipse2.setRadiusY(50) ; 
    ellipse2.setFill(Color.GOLD); 
    Text text5 = new Text("LIBRARY CLOSING..") ; 
    text5.setFont(Font.font("Arial" , 10)); 
    Stop[] stop1 = new Stop[]{ 
         new Stop(0 , Color.LIGHTBLUE) , 
         new Stop(1 , Color.VIOLET), 
         new Stop(0.8 , Color.LIGHTSKYBLUE), 
         new Stop(0.6 , Color.BLANCHEDALMOND)   
    }; 
    RadialGradient rg = new RadialGradient(0,0,370,178,60,true,CycleMethod.REFLECT,stop1)  ; 
     
    ellipse2.setFill(rg) ; 
    ellipse2.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> { 
        stage.close() ;
    }) ;

//     FileInputStream fis = new FileInputStream("main_menu.jpg");
// Image img = new Image(fis);
// imageView.setImage(img);
 
  //  ellipse.setTitle(""); 
    /*Group group = new Group() ; 
    group.getChildren().addAll(ellipse,text) ;*/ 
  
   // StackPane st = new StackPane(ellipse , text  ) ; 
   StackPane []st = new StackPane[5] ; 
   st[0] = new StackPane(ellipse , text) ; 
   st[0].setPadding(new Insets(20));
   st[1] = new StackPane(rect1) ;
   st[1].setPadding(new Insets(20));
   st[2] = new StackPane(rect2 ) ;
    st[2].setPadding(new Insets(20));  
   st[3] = new StackPane(rect3) ;
    st[3].setPadding(new Insets(20)); 
   st[4] = new StackPane(ellipse2 , text5 ) ; 
  VBox root = new VBox(20); // 20 = spacing between StackPanes 
  root.getChildren().addAll(st[0], st[1] , st[2] ,st[3] ,st[4]); 
 
    Image img = new Image(getClass().getResource("main_menu.jpg").toExternalForm());
        BackgroundImage background = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(600, 600, true, true, true, true)
        );

        root.setBackground(new Background(background));

    scene = new Scene(root, 600 , 600); 
    // Stop[] stop3 = new Stop[] { 
    //      new Stop(0.1 , Color.PINK) , 
    //      new Stop(0.5 , Color.ORANGE), 
    //      new Stop(0.8 , Color.BROWN), 
    //      new Stop(0.9 , Color.RED) 
   
    // }; 
 
    // LinearGradient lg1 = new LinearGradient(0 , 1 , 1, 0 , true , CycleMethod.REPEAT , stop3) ; 
 
    //scene.setFill(lg1) ; 
 
    stage.setTitle("Ellipse_Generation"); 
    stage.setScene(scene) ; 
    stage.show() ; 
 
  } 
 
  public static void main(String args[]){ 
  launch(args) ; 
}

}
