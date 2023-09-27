package com.example.project_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private AnchorPane SignIn;

    @FXML
    private AnchorPane SignUp;

    @FXML
    private Button btn_signIn_signIn;

    @FXML
    private Button btn_signIn_signUp;

    @FXML
    private Button btn_signUp_signUp;

    @FXML
    private AnchorPane mainForm;

    @FXML
    private PasswordField txt_signIn_password;

    @FXML
    private TextField txt_signIn_phone;

    @FXML
    private DatePicker txt_signUp_dob;

    @FXML
    private TextField txt_signUp_name;

    @FXML
    private TextField txt_signUp_password;

    @FXML
    private TextField txt_signUp_phone;

    @FXML
    private TextField txt_signUp_rePassword;
    @FXML
    void signIn(ActionEvent event) {
        SignUp.setVisible(false);
        SignIn.setVisible(true);
    }

    @FXML
    void signUp(ActionEvent event) {
        SignIn.setVisible(false);
        SignUp.setVisible(true);
    }

}