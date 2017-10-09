/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

/**
 * FXML Controller class
 *
 * @author Junior Garcia
 */
public class ViewServerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXButton btnDots;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private Label btnFaces;

    @FXML
    private JFXTextField textField;

    @FXML
    private Label btnSend;

    @FXML
    private ScrollPane scrollMSg;
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
