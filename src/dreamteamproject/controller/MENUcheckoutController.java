/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamteamproject.controller;

import dreamteamproject.Main;
import dreamteamproject.model.Acer;
import dreamteamproject.model.Apple;
import dreamteamproject.model.Asus;
import dreamteamproject.model.Lenovo;
import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author stevejobs
 */
public class MENUcheckoutController extends javax.swing.JFrame {

    @FXML
    private Label counterzenbook;
    @FXML
    private Label countervivobook;
    @FXML
    private Label counterrog;
    @FXML
    private Label countertuf;
    @FXML
    private TextField username;
    @FXML
    private TextField report;
    
    private Integer jumlah;

    @FXML
    public void initialize() {
        report.setEditable(false);
        jumlah = Asus.getJumlah() + Acer.getJumlah() + Apple.getJumlah() + Lenovo.getJumlah();
        report.setText("Rp." + jumlah.toString());
    }

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUlogin.fxml");

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

    public void userLenovo(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("scene/MENUlenovo.fxml");

    }

    public void pluslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num + 1));
    }

    public void minuslaptop(ActionEvent e) {
        int num = Integer.parseInt(counterzenbook.getText());
        counterzenbook.setText(Integer.toString(num - 1));

    }

    public void pluslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num + 1));
    }

    public void minuslaptop2(ActionEvent b) {
        int num = Integer.parseInt(countervivobook.getText());
        countervivobook.setText(Integer.toString(num - 1));
    }

    public void pluslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num + 1));
    }

    public void minuslaptop3(ActionEvent c) {
        int num = Integer.parseInt(counterrog.getText());
        counterrog.setText(Integer.toString(num - 1));

    }

    public void pluslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num + 1));
    }

    public void minuslaptop4(ActionEvent d) {
        int num = Integer.parseInt(countertuf.getText());
        countertuf.setText(Integer.toString(num - 1));
    }

    public void userPrint(ActionEvent d) {
        try (FileWriter myWriter = new FileWriter("Report.txt")) {
            myWriter.write(username.getText() + "\n\n");

            myWriter.write(Asus.getLeptop1().getNama() + " = Rp." + Asus.getLeptop1().getHarga() + "\n");
            myWriter.write(Asus.getLeptop2().getNama() + " = Rp." + Asus.getLeptop2().getHarga() + "\n");
            myWriter.write(Asus.getLeptop3().getNama() + " = Rp." + Asus.getLeptop3().getHarga() + "\n");
            myWriter.write(Asus.getLeptop4().getNama() + " = Rp." + Asus.getLeptop4().getHarga() + "\n");

            myWriter.write(Acer.getLeptop1().getNama() + " = Rp." + Acer.getLeptop1().getHarga() + "\n");
            myWriter.write(Acer.getLeptop2().getNama() + " = Rp." + Acer.getLeptop2().getHarga() + "\n");
            myWriter.write(Acer.getLeptop3().getNama() + " = Rp." + Acer.getLeptop3().getHarga() + "\n");
            myWriter.write(Acer.getLeptop4().getNama() + " = Rp." + Acer.getLeptop4().getHarga() + "\n");

            myWriter.write(Apple.getLeptop1().getNama() + " = Rp." + Apple.getLeptop1().getHarga() + "\n");
            myWriter.write(Apple.getLeptop2().getNama() + " = Rp." + Apple.getLeptop2().getHarga() + "\n");
            myWriter.write(Apple.getLeptop3().getNama() + " = Rp." + Apple.getLeptop3().getHarga() + "\n");
            myWriter.write(Apple.getLeptop4().getNama() + " = Rp." + Apple.getLeptop4().getHarga() + "\n");

            myWriter.write(Lenovo.getLeptop1().getNama() + " = Rp." + Lenovo.getLeptop1().getHarga() + "\n");
            myWriter.write(Lenovo.getLeptop2().getNama() + " = Rp." + Lenovo.getLeptop2().getHarga() + "\n");
            myWriter.write(Lenovo.getLeptop3().getNama() + " = Rp." + Lenovo.getLeptop3().getHarga() + "\n");
            myWriter.write(Lenovo.getLeptop4().getNama() + " = Rp." + Lenovo.getLeptop4().getHarga() + "\n");

            myWriter.write("\nJumlah = Rp." + jumlah + "\n");

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
