/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamteamproject.controller;

import dreamteamproject.Main;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MENUloginController {

    @FXML
    public void initialize() {
        new MENUacerController();
        new MENUappleController();
        new MENUasusController();
        new MENUlenovoController();
    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField debitcard;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if (username.getText().toString().equals("0") && debitcard.getText().toString().equals("0")) {
            wrongLogIn.setText("Success!");

            m.changeScene("scene/MENUasus.fxml");
        } else if (username.getText().isEmpty() && debitcard.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data !");
        } else {
            wrongLogIn.setText("Wrong fullname or debitcard !");
        }
    }

}
