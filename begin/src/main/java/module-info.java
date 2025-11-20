module com.begin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.begin to javafx.fxml;
    exports com.begin;
}
