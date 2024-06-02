package javafx_tests;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("com/example/javafx_tests/main_view.fxml"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/javafx_tests/main_view.fxml")));
        Scene scene = new Scene(root);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}