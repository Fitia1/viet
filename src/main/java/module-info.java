module com.example.vtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vtest to javafx.fxml;
    exports com.example.vtest;
}