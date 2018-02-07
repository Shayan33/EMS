package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.service.MethodInt;

import java.io.Serializable;

public class Main extends Application implements Serializable {

    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(new StackPane());
        SelectionManager selectionManager = new SelectionManager(scene);
        selectionManager.showSelectionScreen();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        //MethodInt methodInt = (MethodInt) java.rmi.Naming.lookup("//localhost/Service");
        launch(args);


    }
}
