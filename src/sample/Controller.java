package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField createIdText;
    @FXML
    private Button createUserButton;
    @FXML
    private Button createFileButton;

    @FXML
    private TextField grantIdText;
    @FXML
    private ChoiceBox<String> typeChoiceBox;
    @FXML
    private TextField levelText;
    @FXML
    private Button grantButton;

    @FXML
    private TextField subjectIdText;
    @FXML
    private TextField objectIdText;
    @FXML
    private Button readButton;
    @FXML
    private Button writeButton;

    @FXML
    private ListView<String> userListView;
    @FXML
    private ListView<String> fileListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] types = new String[2];
        types[0] = "User";
        types[1] = "File";

        for (String type : types) {
            typeChoiceBox.getItems().add(type);
        }
        typeChoiceBox.setValue(types[0]);
    }

    @FXML
    public void createUser() {

    }

    @FXML
    public void createFile() {

    }

    @FXML
    public void grantLevel() {

    }

    @FXML
    public void read() {

    }

    @FXML
    public void write() {

    }
}
