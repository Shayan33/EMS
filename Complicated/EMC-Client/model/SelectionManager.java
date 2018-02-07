package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectionManager implements Serializable {
    private Scene scene;

    public SelectionManager(Scene scene) {
        this.scene = scene;
    }

    public void al4eSession(String sessionID) {
        showSIView(sessionID);
    }

    public void back() {
        showSelectionScreen();
    }

    public void showSelectionScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("selection.fxml")
            );
            scene.setRoot((Parent) loader.load());
            SelectionController controller =
                    loader.<SelectionController>getController();
            controller.initManager(this);
        } catch (IOException ex) {
            Logger.getLogger(SelectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showSIView(String sessionID) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("inputSession.fxml")
            );
            scene.setRoot((Parent) loader.load());
            InputSessionController controller =
                    loader.<InputSessionController>getController();
            controller.initSessionID(this, sessionID);
        } catch (IOException ex) {
            Logger.getLogger(InputSessionController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
