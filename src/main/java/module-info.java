module org.example.calculadoracleber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.calculadoracleber to javafx.fxml;
    exports org.example.calculadoracleber;
}