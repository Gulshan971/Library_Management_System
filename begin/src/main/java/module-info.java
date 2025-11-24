module com.begin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql ;
    
    opens com.begin to javafx.fxml;
    exports com.begin;
}
