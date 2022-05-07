module client {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens client to javafx.fxml;
    exports client;
}