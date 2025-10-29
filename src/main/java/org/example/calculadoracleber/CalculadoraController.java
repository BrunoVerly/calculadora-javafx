package org.example.calculadoracleber;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class CalculadoraController {
    @FXML private Label tela;
    @FXML private Button numero0;
    @FXML private Button numero1;
    @FXML private Button numero2;
    @FXML private Button numero3;
    @FXML private Button numero4;
    @FXML private Button numero5;
    @FXML private Button numero6;
    @FXML private Button numero7;
    @FXML private Button numero8;
    @FXML private Button numero9;
    @FXML private Button somar;
    @FXML private Button subtrair;
    @FXML private Button multiplicar;
    @FXML private Button dividir;
    @FXML private Button resultado;
    @FXML private Button raiz;
    @FXML private Button potencia;
    @FXML private Button ponto;
    @FXML private Button limpar;
    @FXML private Button porcentagem;
    ArrayList<Double> numeros = new ArrayList<>();
    ArrayList<String> numerosDigitados = new ArrayList<>();
    ArrayList<Double> soma = new ArrayList<>();
    String tipoOperaçao;

    public void numero0OnAction(ActionEvent actionEvent) {
        tela.setText("0");
    }
    public void numero1OnAction(ActionEvent actionEvent) {

        if(tela.getText().isEmpty()){
            tela.setText("");
        }
        String numeroNaTela = tela.getText() + "1";
        tela.setText(numeroNaTela);


    }
    public void numero2OnAction(ActionEvent actionEvent) {
        tela.setText("2");
    }
    public void numero3OnAction(ActionEvent actionEvent) {
        tela.setText("3");
    }
    public void numero4OnAction(ActionEvent actionEvent) {
        tela.setText("4");
    }
    public void numero5OnAction(ActionEvent actionEvent) {
        tela.setText("5");
    }
    public void numero6OnAction(ActionEvent actionEvent) {
        tela.setText("6");
    }
    public void numero7OnAction(ActionEvent actionEvent) {
        tela.setText("7");
    }
    public void numero8OnAction(ActionEvent actionEvent) {
        tela.setText("8");
    }
    public void numero9OnAction(ActionEvent actionEvent) {
        tela.setText("9");
    }
    public void somarOnAction(ActionEvent actionEvent) {
        tipoOperaçao = "somar";
        numeros.add(Double.valueOf(tela.getText()));
        tela.setText("+");

    }

    public void subtrairOnAction(ActionEvent actionEvent) {}

    public void multiplicarOnAction(ActionEvent actionEvent) {}

    public void dividirOnAction(ActionEvent actionEvent) {}

    public void resultadoOnAction(ActionEvent actionEvent) {
        numeros.add(Double.valueOf(tela.getText()));
        if(tipoOperaçao=="somar"){
        Double resultado = 0.0;
        for (Double numero : numeros) {
            resultado += numero;
        }
        tela.setText(String.valueOf(resultado));
    }}

    public void raizOnAction(ActionEvent actionEvent) {}

    public void potenciaOnAction(ActionEvent actionEvent) {}

    public void pontoOnAction(ActionEvent actionEvent) {}

    public void limparOnAction(ActionEvent actionEvent) {}

    public void porcentagemOnAction(ActionEvent actionEvent) {}









}
