# 🌡️ API de Monitoramento Climático com Risco de Incêndio 🔥

Este projeto é uma API desenvolvida em **Java com Spring Boot** que recebe dados de sensores de temperatura, umidade e vento, analisa esses dados e identifica o nível de risco de incêndio em uma determinada área. Ideal para integração com sistemas embarcados como Arduino ou ESP32.

---

## 🚀 Funcionalidades

- 📥 Receber dados de sensores (temperatura, umidade, vento)
- 🧠 Analisar os dados com base em uma lógica simples de IA
- 🔥 Classificar o risco em:
  - ✅ Baixo
  - ⚠️ Moderado
  - 🔥 Alto risco de incêndio
- 📦 Persistir os dados no banco MySQL
- 📊 Listar histórico de medições

---

## 🔌 Tecnologias Utilizadas

- Java 17+ (compatível com Java 21 ou 24)
- Spring Boot 3.4
- Spring Data JPA
- MySQL
- Maven
- RESTful API

---

## 📡 Exemplo de Requisição (Insomnia/Postman)

```json
POST /clima/analisar
Content-Type: application/json

{
  "temperatura": 36.5,
  "umidade": 28,
  "vento": 18
}
