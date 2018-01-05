package io.github.hexirp.akariki;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(App.class, args);
    }

    @Override
    public void start(Stage stage) {
        final Label label = new Label("Hello World!");

        final BorderPane pane = new BorderPane();
        pane.setCenter(label);

        final Scene scene = new Scene(pane, 320, 120);

        stage.setTitle("akariki");
        stage.setScene(scene);
        stage.show();
    }
}
