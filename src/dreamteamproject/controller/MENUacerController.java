/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamteamproject.controller;

import dreamteamproject.Main;
import dreamteamproject.model.Acer;
import dreamteamproject.model.BaseLeptop;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author stevejobs
 */
public class MENUacerController {

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

    public MENUacerController() {

        leptop1 = new BaseLeptop();
        leptop2 = new BaseLeptop();
        leptop3 = new BaseLeptop();
        leptop4 = new BaseLeptop();
        leptop1.setNama("Aspire");
        leptop2.setNama("Swift");
        leptop3.setNama("Nitro");
        leptop4.setNama("Predator");
        Acer.setLeptop1(leptop1);
        Acer.setLeptop2(leptop2);
        Acer.setLeptop3(leptop3);
        Acer.setLeptop4(leptop4);
        System.out.println(Acer.getLeptop1().getHarga().toString());
    }

    @FXML
    public void initialize() {
        
        counterzenbook.setText(Acer.getLeptop1().getJumlah().toString());
        countervivobook.setText(Acer.getLeptop2().getJumlah().toString());
        counterrog.setText(Acer.getLeptop3().getJumlah().toString());
        countertuf.setText(Acer.getLeptop4().getJumlah().toString());
    }

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

    public void pluslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num + 1));

        leptop1.setHarga(leptop1.getHarga() + 8100000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop1(leptop1);
    }

    public void minuslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num - 1));

        leptop1.setHarga(leptop1.getHarga() - 8100000);
        leptop1.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop1(leptop1);

    }

    public void pluslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num + 1));

        leptop2.setHarga(leptop2.getHarga() + 7399000);
        leptop2.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop2(leptop2);
    }

    public void minuslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num - 1));

        leptop2.setHarga(leptop2.getHarga() - 7399000);
        leptop2.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop2(leptop2);
    }

    public void pluslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num + 1));

        leptop3.setHarga(leptop3.getHarga() + 14100000);
        leptop3.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop3(leptop3);
    }

    public void minuslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num - 1));

        leptop3.setHarga(leptop3.getHarga() - 14100000);
        leptop3.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop3(leptop3);

    }

    public void pluslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num + 1));

        leptop4.setHarga(leptop4.getHarga() + 16300000);
        leptop4.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop4(leptop4);
    }

    public void minuslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num - 1));

        leptop4.setHarga(leptop4.getHarga() - 16300000);
        leptop4.setJumlah(Integer.parseInt(counterzenbook.getText()));

        Acer.setLeptop4(leptop4);
    }
}
