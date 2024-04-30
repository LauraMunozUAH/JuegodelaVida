module com.example.juegodelavida {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.juegodelavida to javafx.fxml;
    exports com.example.juegodelavida;
}