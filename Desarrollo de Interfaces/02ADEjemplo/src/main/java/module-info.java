module org.example._2adejemplo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example._2adejemplo to javafx.fxml;
    exports org.example._2adejemplo;
}