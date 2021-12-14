/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamteamproject.controller;

import dreamteamproject.Main;
import dreamteamproject.model.Asus;
import dreamteamproject.model.BaseLeptop;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author stevejobs
 */
public class MENUasusController {

    private final BaseLeptop leptop1;
    private final BaseLeptop leptop2;
    private final BaseLeptop leptop3;
    private final BaseLeptop leptop4;
    @FXML
    private Label counterzenbook;
    @FXML
    private Label countervivobook;
    @FXML
    private Label counterrog;
    @FXML
    private Label countertuf;

    public MENUasusController() {
        leptop1 = new BaseLeptop();
        leptop2 = new BaseLeptop();
        leptop3 = new BaseLeptop();
        leptop4 = new BaseLeptop();
        leptop1.setNama("VivoBook");
        leptop2.setNama("ZenBook");
        leptop3.setNama("ROG");
        leptop4.setNama("TUF");
        Asus.setLeptop1(leptop1);
        Asus.setLeptop2(leptop2);
        Asus.setLeptop3(leptop3);
        Asus.setLeptop4(leptop4);
    }

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/login.fxml");

    }

    public void userApple(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUapple.fxml");

    }

    public void userAcer(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUacer.fxml");

    }

    public void userLenovo(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUlenovo.fxml");

    }

    public void userCheckOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUcheckout.fxml");

    }

    public void pluslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num + 1));

        leptop1.setHarga(leptop1.getHarga() + 9500000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop1(leptop1);
    }

    public void minuslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num - 1));

        leptop1.setHarga(leptop1.getHarga() - 9500000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop1(leptop1);

    }

    public void pluslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num + 1));

        leptop2.setHarga(leptop2.getHarga() + 8500000);
        leptop2.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop2(leptop2);
    }

    public void minuslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num - 1));

        leptop2.setHarga(leptop2.getHarga() - 8500000);
        leptop2.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop2(leptop2);
    }

    public void pluslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num + 1));

        leptop3.setHarga(leptop3.getHarga() + 18000000);
        leptop3.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop3(leptop3);
    }

    public void minuslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num - 1));

        leptop3.setHarga(leptop3.getHarga() - 18000000);
        leptop3.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop3(leptop3);

    }

    public void pluslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num + 1));

        leptop4.setHarga(leptop4.getHarga() + 16500000);
        leptop4.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop4(leptop4);
    }

    public void minuslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num - 1));

        leptop4.setHarga(leptop4.getHarga() - 16500000);
        leptop4.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Asus.setLeptop4(leptop4);
    }
}
