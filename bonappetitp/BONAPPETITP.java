/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetitp;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author noufa
 */
public class BONAPPETITP extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("First.fxml"));
        /* start with first interface */
        Scene scene = new Scene(root);
        Image icon = new Image(getClass().getResourceAsStream("..\\image\\BonAppetit.jpg"));
        primaryStage.getIcons().add(icon);
        scene.getStylesheets().add("/CSS/styleSheet.css");
        primaryStage.setTitle("BonAppetit");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
