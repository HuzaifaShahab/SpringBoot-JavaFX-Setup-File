package com.alabtaal.inventory.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class LoginController implements Initializable {
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passPasswordField ;
    @FXML
    private Button loginButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void onloginButtonPressed()
    {
        System.out.println(usernameTextField.getText());
        System.out.println(passPasswordField.getText());
    }
}
