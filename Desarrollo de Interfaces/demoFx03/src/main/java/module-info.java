module org.example.demofx03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demofx03 to javafx.fxml;
    exports org.example.demofx03;
}