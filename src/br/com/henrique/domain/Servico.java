/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Servico {

    private Integer id;
    private Date horaEntrada;
    private Date horaSaida;
    private Double valor;
    private Carro carro;
    private Boolean ativo;

    public Servico() {

    }

    public Servico(Integer id, Condutor condutor, Date horaEntrada, Date horaSaida, Double valor) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.valor = valor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
