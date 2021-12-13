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
import javafx.scene.control.Label;

/**
 *
 * @author stevejobs
 */
public class MENUacerController {


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/login.fxml");

    }
    
    public void userAsus(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUasus.fxml");

    }
    
    public void userApple(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUapple.fxml");

    }
    
    public void userLenovo(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUlenovo.fxml");

    }
    
    public void userCheckOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUcheckout.fxml");

    }
    
    @FXML
    private Label counterzenbook;
    
    public void pluslaptop(ActionEvent e){
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num+1));
    }
    
    public void minuslaptop(ActionEvent e){
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num-1));
    
    }
    
    @FXML
    private Label countervivobook;
    
    public void pluslaptop2(ActionEvent b){
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num+1));
    }
    
    public void minuslaptop2(ActionEvent b){
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label counterrog;
    
    public void pluslaptop3(ActionEvent c){
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num+1));
    }
    
    public void minuslaptop3(ActionEvent c){
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num-1));
    
    }
    
    @FXML
    private Label countertuf;
        
    public void pluslaptop4(ActionEvent d){
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num+1));
    }
    
    public void minuslaptop4(ActionEvent d){
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num-1));
    }
}
