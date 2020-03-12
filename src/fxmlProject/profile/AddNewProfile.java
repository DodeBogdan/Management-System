package fxmlProject.profile;

import DataBase.DataBaseConnection;
import fxmlProject.mainClass;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class AddNewProfile {

    @FXML
    TextField profileName;
    @FXML
    Button okButton;
    private mainClass main;
    private DataBaseConnection dataBaseConnection = new DataBaseConnection();
    private Connection connection = dataBaseConnection.connect();

    @FXML
    private void initialize() {
        okButton.setDisable(true);
    }

    @FXML
    private boolean verifyProfileName() {
        String profileNameText = profileName.getText();
        if (profileNameText.length() < 3) {
            profileName.clear();
            profileName.setText("Invalid name!");
            profileName.selectAll();
            okButton.setDisable(true);
            return false;
        }
        for (int index = 0; index < profileNameText.length(); index++) {
            if (!Pattern.matches("[a-zA-Z ]+", profileNameText)) {
                profileName.clear();
                profileName.setText("Invalid name!");
                profileName.selectAll();
                okButton.setDisable(true);
                return false;
            }
        }
        enableOk();
        return true;
    }

    @FXML
    private void enableOk() {
        okButton.setDisable(false);
    }

    @FXML
    private void closeScene() throws IOException {
        main.closeAddStudentScene();
    }

    @FXML
    private void addProfile() throws SQLException, IOException {
        PreparedStatement profileInsert = connection.prepareStatement("call insertGroupType(?)");
        profileInsert.setString(1, profileName.getText());
        profileInsert.executeQuery();

        closeScene();
    }
}
