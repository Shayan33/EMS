package model;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
//import javax.json.*;
import javafx.util.Callback;
import model.service.MethodInt;
import org.json.simple.*;
import java.io.Serializable;

public class InputSessionController implements Serializable{

    @FXML private Button backButton;
    @FXML private Label backLabel;
    @FXML private Text text;
    @FXML private TableView<Student> tableView;

    private ObservableList<Student> observableList = FXCollections.observableArrayList();

    @FXML private TableColumn<Student, String> stuName;
    @FXML private TableColumn<Student, String> stuLast;
    @FXML private TableColumn<Student, String> stuID;
    @FXML private TableColumn<Student, String> stuStatus;


    //final LoginManager loginManager, String sessionID
    public void initSessionID(final SelectionManager selectionManager, String sessionID) throws Exception {
        MethodInt methodInt = (MethodInt) java.rmi.Naming.lookup("//localhost/Service");
        backLabel.setText("Absent List for Session " + sessionID + " is");

        //onArray jsonArray;

        long sessionIDlong = Long.parseLong(sessionID);
        JSONArray jsonArray = new JSONArray();
        jsonArray = methodInt.absentListInEachSession4Interface(sessionIDlong);


        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            Student student =  new Student(jsonObject.get("name").toString(),jsonObject.get("last").toString() , jsonObject.get("id").toString(), jsonObject.get("status").toString());
            observableList.add(student);
        }

        stuName.setCellValueFactory(
                //new PropertyValueFactory<Student,String>("name")
                cellData -> new ReadOnlyStringWrapper(cellData.getValue().getName()));

        stuLast.setCellValueFactory(
                cellData -> new ReadOnlyStringWrapper(cellData.getValue().getLast())
        );

        stuID.setCellValueFactory(
               // new PropertyValueFactory<Student,String>("id")
                cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));


        stuStatus.setCellValueFactory(
               // new PropertyValueFactory<Student,String>("status")
                cellData -> new ReadOnlyStringWrapper(cellData.getValue().getStatus()));


        tableView.setItems(observableList);

       backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                //call IntMethod
                selectionManager.back();
            }
        });
    }
}
