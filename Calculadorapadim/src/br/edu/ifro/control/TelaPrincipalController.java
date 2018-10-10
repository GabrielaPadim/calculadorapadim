/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 01453074252
 */
public class TelaPrincipalController implements Initializable {
    @FXML
    private TextField txtnumero1, txtnumero2,txtresultado;
    @FXML
    private Label  lblNumero1, lblNumero2, lblResultado;
    
    @FXML
    private void soma(ActionEvent event) {
Double num1= Double.parseDouble(txtnumero1.getText());
Double num2= Double.parseDouble(txtnumero2.getText());
Double resultado= num1+num2;
txtresultado.setText(resultado.toString());
    }
    @FXML
    private void subtracao(ActionEvent event) {
Double num1= Double.parseDouble(txtnumero1.getText());
Double num2= Double.parseDouble(txtnumero2.getText());
Double resultado= num1-num2;
txtresultado.setText(resultado.toString());
        }
    @FXML
    private void divisao(ActionEvent event) {
Double num1= Double.parseDouble(txtnumero1.getText());
Double num2= Double.parseDouble(txtnumero2.getText());
Double resultado= num1/num2;
txtresultado.setText(resultado.toString());
        }
    @FXML
    private void multiplicacao(ActionEvent event) {
Double num1= Double.parseDouble(txtnumero1.getText());
Double num2= Double.parseDouble(txtnumero2.getText());
Double resultado= num1*num2;
txtresultado.setText(resultado.toString());
        }
    @FXML
    public void Limpar(){
	txtnumero1.setText("");
	txtnumero2.setText("");
	txtresultado.setText("");  
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
