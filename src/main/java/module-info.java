module com.example.notepadsharp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notepadsharp to javafx.fxml;
    exports com.example.notepadsharp;
}