/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.domain;

import java.util.List;

/**
 *
 * @author ACER
 */
public class Carro {

    private Integer id;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;
    private Boolean ativo;
    private List<Servico> tempoDeServicos;
    private Condutor condutor;

    public Carro() {
    }

    public Carro(Integer id, String placa, String cor, String marca, String modelo, Condutor condutor) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.condutor = condutor;
    }

    public List<Servico> getTempoDeServicos() {
        return tempoDeServicos;
    }

    public void setTempoDeServicos(List<Servico> tempoDeServicos) {
        this.tempoDeServicos = tempoDeServicos;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Placa: " + placa
                + "\nCor Predominante: " + cor
                + "\nMarca: " + marca
                + "\nModelo: " + modelo;
    }

}
