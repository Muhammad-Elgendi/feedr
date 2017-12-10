package app.controllers;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginController extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent = FXMLLoader.load(getClass().getResource("FXMLlogin.fxml"));
        Scene sc = new Scene(parent);
        sc.getStylesheets().add("hospital/application.css");
        primaryStage.setScene(sc);
        primaryStage.setTitle("Login Frame ");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
