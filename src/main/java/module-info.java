module com.cono {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cono to javafx.fxml;
    exports com.cono;
}
