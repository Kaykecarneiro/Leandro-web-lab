# 🌐 API REST construída com Spring Boot e MySQL

Este repositório contém uma API desenvolvida com **Spring Boot** e integrada ao **MySQL**.  
O objetivo é fornecer uma base organizada para projetos Java modernos, com separação clara das camadas e boas práticas. O projeto foi criado usando a **IDE IntelliJ IDEA**.

---

## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Maven  
- Lombok  
- Swagger/OpenAPI  
- IntelliJ IDEA  

---

## 📂 Estrutura do Projeto

```plaintext
src/
 ├── main/
 │   ├── java/
 │   │   └── com/
 │   │       └── seu_pacote/
 │   │           ├── controller/        # Controladores da API
 │   │           ├── model/             # Entidades do sistema
 │   │           ├── repository/        # Interfaces JPA
 │   │           ├── service/           # Camada de regras de negócio
 │   │           └── Application.java   # Classe principal da aplicação
 │   └── resources/
 │       ├── application.properties     # Configurações da aplicação
 │       └── ...
 └── test/                              # Testes automatizados
