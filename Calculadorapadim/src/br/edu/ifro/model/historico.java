/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 01453074252
 */
public class historico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     private Integer id;
     private String operador;
     private float primeirovalor, segundovalor, resultado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String cpf) {
        this.operador = operador;
    }

    public float getPrimeirovalor() {
        return primeirovalor;
    }

    public void setPrimeirovalor(String senha) {
        this.primeirovalor = primeirovalor;
    }
    public float getSegundovalor() {
        return segundovalor;
    }
    public void setSegundovalor() {
        this.segundovalor = segundovalor;
    }
    public float getResultado() {
        return resultado;
    }
    public void setResultado() {
        this.resultado = resultado;
    }
    
}
