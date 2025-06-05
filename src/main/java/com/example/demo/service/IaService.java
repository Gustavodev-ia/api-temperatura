package com.example.demo.service;

import com.example.demo.model.Clima;
import org.springframework.stereotype.Service;


@Service
public class IaService {

    public String analisar(Clima clima) {
        double temp = clima.getTemperatura();
        double umidade = clima.getUmidade();
        double vento = clima.getVento();

        if (temp > 35 && umidade < 30 && vento > 15) {
            return "🔥 Risco Alto de Incêndio";
        } else if (temp > 30 && umidade < 40) {
            return "⚠️ Risco Moderado";
        } else {
            return "✅ Risco Baixo";
        }
    }
}
