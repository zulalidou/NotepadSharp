package com.example.notepadsharp;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private void closeApp() {
        Platform.exit();
    }
}