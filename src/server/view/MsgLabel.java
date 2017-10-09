package server.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 *
 * @author Rental Servicios
 */
public class MsgLabel extends Label{
    
    private String text;

    public MsgLabel(String text) {
        getStylesheets().add(getClass().getResource("custom.css").toExternalForm());
        getStyleClass().add("msg-label");
        setPadding(new Insets(10,15,10,15));
        setText(text + "\n");
    }
}
