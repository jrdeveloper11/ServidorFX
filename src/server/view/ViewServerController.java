/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
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
public class ViewServerController implements Initializable, Runnable {

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
    private ScrollPane scrollMsg;
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        Thread miHilo = new Thread(this);
        miHilo.start();
    }    
    
    public void initEvents(){
    }

    @Override
    public void run() {
        MsgLabel msg;
        try {
            ServerSocket socketServer = new ServerSocket(9999);
            while(true){
            Socket miSocket = socketServer.accept();
            DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
            msg =  new MsgLabel(flujo_entrada.readUTF());
                System.out.println("" + flujo_entrada.readUTF());
            scrollMsg.setContent(msg);
            
            flujo_entrada.close();
            socketServer.close();
            miSocket.close();
            }
        } catch (IOException ex) {
            System.out.println("Falla en el servidor");
        }
        System.out.println("Estoy a la escucha");
    }
}
