# 💬 Sistema de Notificações com Design Patterns em Java

## 📌 Descrição

Este projeto demonstra a aplicação prática de padrões de projeto (Design Patterns) em Java, organizando um sistema simples e extensível de envio de notificações. Utilizando os padrões **Strategy**, **Factory** e **Singleton**, a aplicação permite alternar entre diferentes canais de notificação (como e-mail, SMS e push) de forma desacoplada e orientada a boas práticas de programação.

O principal objetivo é oferecer um exemplo didático e bem estruturado para estudantes e desenvolvedores que desejam entender como aplicar Design Patterns na prática, em uma arquitetura limpa e modular.

---

## 📦 Estrutura de Pacotes

src/
├── app/ # Classe principal (Main.java)
├── config/ # Configuração central com Singleton
├── factory/ # Fábrica de notificadores (Factory)
├── model/ # Interface base Notificator
├── strategy/ # Implementações (Email, SMS, Push)


---

## 🛠️ Tecnologias Utilizadas

- Java 17 ou superior
- IntelliJ IDEA
- Git e GitHub

---

## 💡 Design Patterns Aplicados

- **Strategy**: Define diferentes estratégias de notificação.
- **Factory**: Cria instâncias dos notificadores com base no tipo escolhido.
- **Singleton**: Garante uma única instância da classe de configuração.

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/notificacao-patterns-java.git
   cd notificacao-patterns-java

📈 Exemplo de Saída
Enviando SMS: Olá, este é um teste de notificação!
