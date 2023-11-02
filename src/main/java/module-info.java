module ipap.multi1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ipap.multi1 to javafx.fxml;
    exports ipap.multi1;
}