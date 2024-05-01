package com.example.juegodelavida;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML private GridPane tableroDeJuego;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Cargando el tablero de juego");

        // Mismo bucle que en el ejemplo de MainGridApplication
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Aquí podrías instanciar tu LetrasColoresGrid
                // LetrasColoresGrid customComponent = new LetrasColoresGrid();
                // mainGrid.add(customComponent, i, j);

                // Ejemplo simplificado con un Label
                Label placeholder = new Label("Celda " + i + "," + j);
                Button b = new Button();
                VBox layout = new VBox(b, placeholder);
                placeholder.setMinSize(30, 30); // Tamaño mínimo para visualización
                placeholder.setStyle("-fx-border-color: black; -fx-text-alignment: center;");
                tableroDeJuego.add(placeholder, i, j);
            }
        }
    }
}