/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamteamproject.controller;

import dreamteamproject.Main;
import dreamteamproject.model.BaseLeptop;
import dreamteamproject.model.Lenovo;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author stevejobs
 */
public class MENUlenovoController {

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

    public MENUlenovoController() {

        leptop1 = new BaseLeptop();
        leptop2 = new BaseLeptop();
        leptop3 = new BaseLeptop();
        leptop4 = new BaseLeptop();
        leptop1.setNama("ThinkPad");
        leptop2.setNama("IdeaPad");
        leptop3.setNama("Yoga");
        leptop4.setNama("Legion");
        Lenovo.setLeptop1(leptop1);
        Lenovo.setLeptop2(leptop2);
        Lenovo.setLeptop3(leptop3);
        Lenovo.setLeptop4(leptop4);
    }

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/login.fxml");

    }

    public void userAsus(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUasus.fxml");

    }

    public void userAcer(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUacer.fxml");

    }

    public void userApple(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUapple.fxml");

    }

    public void userCheckOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUcheckout.fxml");

    }

    public void pluslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num + 1));

        leptop1.setHarga(leptop1.getHarga() + 15250000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Lenovo.setLeptop1(leptop1);
    }

    public void minuslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num - 1));

        leptop1.setHarga(leptop1.getHarga() - 15250000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Lenovo.setLeptop1(leptop1);

    }

    public void pluslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num + 1));

        leptop2.setHarga(leptop2.getHarga() + 7150000);
        leptop2.setJumlah(Integer.parseInt(countervivobook.getText()));

        Lenovo.setLeptop2(leptop2);
    }

    public void minuslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num - 1));

        leptop2.setHarga(leptop2.getHarga() - 7150000);
        leptop2.setJumlah(Integer.parseInt(countervivobook.getText()));

        Lenovo.setLeptop2(leptop2);
    }

    public void pluslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num + 1));

        leptop3.setHarga(leptop3.getHarga() + 18000000);
        leptop3.setJumlah(Integer.parseInt(counterrog.getText()));

        Lenovo.setLeptop3(leptop3);
    }

    public void minuslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num - 1));

        leptop3.setHarga(leptop3.getHarga() - 18000000);
        leptop3.setJumlah(Integer.parseInt(counterrog.getText()));

        Lenovo.setLeptop3(leptop3);

    }

    public void pluslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num + 1));

        leptop4.setHarga(leptop4.getHarga() + 28000000);
        leptop4.setJumlah(Integer.parseInt(countertuf.getText()));

        Lenovo.setLeptop4(leptop4);
    }

    public void minuslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num - 1));

        leptop4.setHarga(leptop4.getHarga() - 28000000);
        leptop4.setJumlah(Integer.parseInt(countertuf.getText()));

        Lenovo.setLeptop4(leptop4);
    }
}
