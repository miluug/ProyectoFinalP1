module org.example.proyectofinalmusica {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectofinalmusica to javafx.fxml;
    exports org.example.proyectofinalmusica;
}