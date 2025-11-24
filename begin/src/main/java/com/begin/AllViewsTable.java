package com.begin;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AllViewsTable extends Application {

    private static Scene scene ;

    @Override
    public void start(Stage stage)throws Exception{
        TableView<AllBooks> table = new TableView<>();
        ObservableList<AllBooks> data = FXCollections.observableArrayList(BookDAO.getAllBooks());

        TableColumn<AllBooks, String> idCol = new TableColumn<>("Book ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("book_id"));

        TableColumn<AllBooks, String> nameCol = new TableColumn<>("Book Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("book_name"));

        TableColumn<AllBooks, String> authorCol = new TableColumn<>("Author");
        authorCol.setCellValueFactory(new PropertyValueFactory<>("book_author"));

        TableColumn<AllBooks, String> editionCol = new TableColumn<>("Edition");
        editionCol.setCellValueFactory(new PropertyValueFactory<>("book_edition"));

        TableColumn<AllBooks, String> isbnCol = new TableColumn<>("ISBN");
        isbnCol.setCellValueFactory(new PropertyValueFactory<>("book_Isbn"));

        TableColumn<AllBooks, Double> priceCol = new TableColumn<>("Price");
        priceCol.setCellValueFactory(new PropertyValueFactory<>("book_price"));

        table.getColumns().addAll(idCol, nameCol, authorCol, editionCol, isbnCol, priceCol);
        table.setItems(data);

        Button backBtn = new Button("Back to Main Menu");
        backBtn.setStyle("color:purple") ;

        backBtn.setOnAction(e -> {
        try {
            MAinMenu mainMenu = new MAinMenu(); // your main menu class
            mainMenu.start(stage);             // reopen main menu
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       });

       Button studentMenu = new Button("Student DAshboard") ;
       studentMenu.setOnAction(e ->{
        StudentDashboard studentDashboard = new StudentDashboard() ;
        try{
            studentDashboard.start(stage) ;
        
        } catch (Exception ex) {
            ex.getMessage() ;
        }
       });

        VBox root = new VBox(10 ,table, backBtn);
        Scene scene = new Scene(root, 800, 400);
        stage.setScene(scene);
        stage.setTitle("All Books");
        stage.show();
    }
  
}
