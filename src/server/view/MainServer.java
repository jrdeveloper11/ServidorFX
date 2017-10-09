package server.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Junior Garcia
 */
public class MainServer extends Application {
    
    private Parent createContent() {
        
        AnchorPane mainPane = null;
        try {
            mainPane = FXMLLoader.load(getClass().getResource("ViewServer.fxml"));
        } catch (IOException ex) {
            System.out.println("Falla en carga de FXML");
        }
        return mainPane;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("PepaServer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
