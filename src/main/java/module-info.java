module com.example.studenta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studenta to javafx.fxml;
    exports com.example.studenta;
}