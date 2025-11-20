package com.begin;





import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LibrarianLogin extends Application {
    private static Scene scene ;
    @Override
    public void start(Stage stage)throws Exception{
        // Text title = new Text("LIBRARIAN_LOGIN");
        // title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        // Label usernameLabel = new Label("Username:");
        // usernameLabel.setAlignment(Pos.CENTER_LEFT); 
        // TextField usernameField = new TextField();
        // usernameField.setPromptText("Enter Username");
        Text title = new Text("LIBRARIAN_LOGIN");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;"); 

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button submit = new Button("Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(12));
        grid.setHgap(5);
        grid.setVgap(8);
        grid.add(title, 1, 0);
        grid.add(usernameLabel, 0, 1);
        grid.add(usernameField, 1, 1);
        grid.add(passwordLabel, 0,2);
        grid.add(passwordField, 1, 2);
        grid.add(submit, 1,3);

        // Column constraints: column 1 expands
        ColumnConstraints c0 = new ColumnConstraints();
        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        c1.setHgrow(Priority.ALWAYS);
        c1.setFillWidth(true);
        grid.getColumnConstraints().addAll(c0, c1, c2);

        // Make the fields fill their cells
        usernameField.setMaxWidth(Double.MAX_VALUE / 10);
        passwordField.setMaxWidth(Double.MAX_VALUE / 10);

        // Align labels to the right in their cells (neater look)
        GridPane.setHalignment(usernameLabel, HPos.CENTER);
        GridPane.setHalignment(passwordLabel, HPos.CENTER);

         submit.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            // Handle login logic here
            System.out.println("Username: " + username + ", Password: " + password);
        });

        scene = new Scene(grid, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
