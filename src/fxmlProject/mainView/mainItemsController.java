package fxmlProject.mainView;

import fxmlProject.mainClass;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.io.IOException;

public class mainItemsController {

    private mainClass main;


    @FXML
    private void goStudentListScene() throws IOException {
        main.showStudentListScene();
    }

    @FXML
    private void goAddStudentScene() throws IOException {
        main.showAddStudentScene();
    }

    @FXML
    private void goListSubjects() throws IOException {
        main.showSubjectsListScene();
    }

    @FXML
    private void goListProfile() throws IOException {
        main.showListProfileScene();
    }

    @FXML
    private void goAddNewProfile() throws IOException {
        main.showAddNewProfile();
    }

    @FXML
    private void goAddNewSubject() throws IOException {
        main.showAddNewSubject();
    }

    @FXML
    private void goAddNewGroup() throws IOException {
        main.showAddNewGroup();
    }

    @FXML
    private void goGroupList() throws IOException {
        main.showGroupList();
    }

    @FXML
    private void goAddNewTeacher() throws IOException {
        main.showAddNewTeacher();
    }

    @FXML
    private void goTeachersList() throws IOException {
        main.showTeachersList();
    }

    @FXML
    private void goAddNewRegistry() throws IOException {
        main.showAddNewRegistry();
    }

    @FXML
    private void goRegistryList() throws IOException {
        main.showRegistryList();
    }

    @FXML
    private void allert() {
        String string;
        string = "Informatizarea evidenţei activităţii profesionale şi stiinţifice a studenţilor Facultăţii de Matematică şi Informatică.\n";
        string += "Proiect realizat de Bogdan Gheorghe Nicolae.\n";
        string += "Profesor coordonator Bocu Dorin.\n";
        Alert alert = new Alert(Alert.AlertType.NONE, string, javafx.scene.control.ButtonType.OK);
        alert.setHeight(300);
        alert.setResizable(true);
        alert.setTitle("About");
        alert.showAndWait();
    }

    public void closeApplication() throws Exception {
        main.primaryStage.close();
    }
}
