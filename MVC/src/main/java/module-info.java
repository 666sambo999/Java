module org.example.mvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens org.example.mvc to javafx.fxml;
    exports org.example.mvc;
    exports org.example.mvc.Controller;
    opens org.example.mvc.Controller to javafx.fxml;
    exports org.openjfx.academyfx_mvc.Controller;
    opens org.openjfx.academyfx_mvc.Controller to javafx.fxml;
}