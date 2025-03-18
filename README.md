# 🎁 Amigo Secreto

Este projeto é um sistema para sorteio de amigo secreto, desenvolvido com **Spring Boot** para o back-end e **HTML, CSS e JavaScript** para o front-end. A aplicação permite que os usuários cadastrem seus nomes e realizem o sorteio de forma automatizada.

## 🚀 Tecnologias Utilizadas

- **Back-end:** Java, Spring Boot, Spring MVC, Spring Data JPA
- **Banco de Dados:** H2 (pode ser alterado para MySQL ou PostgreSQL)
- **Front-end:** HTML, CSS e JavaScript
- **Build Tool:** Maven
- **Gerenciamento de Versão:** Git e GitHub

## 📌 Funcionalidades

- Cadastro de participantes do amigo secreto
- Sorteio automático dos pares
- Interface simples e intuitiva
- Persistência dos participantes e do resultado do sorteio no banco de dados
- Exibição dos resultados após o sorteio

## 📁 Estrutura do Projeto

```
├── src/
│   ├── main/
│   │   ├── java/com/example/amigosecreto/
│   │   │   ├── controller/       # Controladores Spring MVC
│   │   │   ├── model/            # Modelos da aplicação
│   │   │   ├── service/          # Regras de negócio
│   │   │   ├── AmigosecretoApplication.java  # Classe principal do Spring Boot
│   │   ├── resources/
│   │   │   ├── static/            # Arquivos estáticos (HTML, CSS, JS)
│   │   │   │   ├── index.html
│   │   │   │   ├── style.css
│   │   │   │   ├── script.js
│   │   │   ├── application.properties  # Configurações do Spring Boot
│   ├── test/java/com/example/amigosecreto/  # Testes unitários
├── pom.xml  # Gerenciador de dependências (Maven)
├── .gitignore
└── README.md
```

## 🛠️ Como Rodar o Projeto Localmente

### 1️⃣ Pré-requisitos

- **Java 17 ou superior**
- **Maven** instalado
- **Git** instalado

### 2️⃣ Clonar o Repositório

```bash
git clone https://github.com/Pedro-Henrique-Chiquitto/amigo-secreto.git
cd amigo-secreto
```

### 3️⃣ Configurar o Banco de Dados

A aplicação está configurada para rodar com um banco de dados em memória (**H2**). Caso queira usar outro banco, edite o arquivo `application.properties`.

### 4️⃣ Executar a Aplicação

```bash
mvn spring-boot:run
```

A aplicação estará rodando em `http://localhost:8080`

### 5️⃣ Acessar a Interface Web

Abra um navegador e acesse:

```
http://localhost:8080
```

## 🎯 Futuras Melhorias

- Adicionar autenticação para os participantes
- Melhorar a interface com frameworks como Bootstrap ou React
- Armazenamento persistente usando um banco de dados como MySQL ou PostgreSQL
- Implantação na nuvem (Heroku, AWS, etc.)

## 🖥️ Como Fazer o Deploy (Back-End no Heroku)

1. **Criar um aplicativo no Heroku:**

```bash
heroku create nome-do-app
```

2. **Adicionar o repositório remoto do Heroku:**

```bash
git remote add heroku https://git.heroku.com/nome-do-app.git
```

3. **Fazer o deploy:**

```bash
git push heroku main
```

A aplicação estará acessível em:

```
https://nome-do-app.herokuapp.com
```

## 📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e modificá-lo!

---

Se precisar de ajuda para o deploy ou para melhorias no projeto, entre em contato! 🚀

