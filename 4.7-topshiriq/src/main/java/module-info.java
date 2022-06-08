module com.example.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task to javafx.fxml;
    exports com.example.task;
}