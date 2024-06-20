package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class LoginformController {

    @FXML
    private ToggleGroup accountType;

    @FXML
    private JFXRadioButton rBtnAccount;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXPasswordField txtPWD;

    @FXML
    void signUpOnAction(ActionEvent event) {

    }

    @FXML
    void signinOnAction(ActionEvent event) {

    }
}
