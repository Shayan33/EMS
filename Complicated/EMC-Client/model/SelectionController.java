package model;

import java.io.Serializable;
import java.net.URL;

import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.converter.IntegerStringConverter;

import java.util.ResourceBundle;

public class SelectionController implements Serializable {



    @FXML private Button al4es;
    @FXML private Button al4est;
    @FXML private Button al;
    @FXML private Button fl;
    @FXML private Button ap;
    @FXML private Button wce;
    @FXML private Button sr;
    @FXML private Button vl4fe;
    @FXML private TextField sessionID;
    @FXML private TextField studentID1;
    @FXML private TextField studentID2;

    public void initialize() {}

    public void initManager(final SelectionManager selectionManager ) {
        al4es.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                String seID = authorize();
                if (seID != null)
                    selectionManager.al4eSession(seID);
            }
        });
    }

    private String authorize() {
        String sesID = sessionID.getText();
        return sesID = ((Integer.parseInt(sessionID.getText()) > 0) && Integer.parseInt(sessionID.getText()) < 13) ? sessionID.getText() : null;

    }

}
