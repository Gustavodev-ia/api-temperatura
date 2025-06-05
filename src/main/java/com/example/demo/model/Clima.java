package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clima {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double temperatura;
    private Double umidade;
    private Double vento;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public Double getVento() {
        return vento;
    }

    public void setVento(Double vento) {
        this.vento = vento;
    }
}
