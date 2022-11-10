module uz.bakhromjon.javafxcheckbox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxcheckbox to javafx.fxml;
    exports uz.bakhromjon.javafxcheckbox;
}