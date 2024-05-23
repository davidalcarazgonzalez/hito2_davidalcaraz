module com.example.hito2_davidalcaraz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.hito2_davidalcaraz to javafx.fxml;
    exports com.example.hito2_davidalcaraz;
}