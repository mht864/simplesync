module hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.simplesync to javafx.fxml;
    exports com.simplesync;
}