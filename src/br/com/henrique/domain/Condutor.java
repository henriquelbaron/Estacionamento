/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Condutor {

    private Integer id;
    private String nome;
    private String tipo;
    private boolean ativo;
    private List<Carro> carros;

    public Condutor() {
    }

    public Condutor(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public boolean verificaPlacaExistente(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setOnList(Carro c) {
        carros.add(c);
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carro) {
        this.carros = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome + " - " + tipo;
    }

}
