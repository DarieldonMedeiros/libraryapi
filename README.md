# Library API

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.8+-blue.svg)](https://maven.apache.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13+-blue.svg)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## Descrição

### O que faz o app?

A Library API é uma aplicação backend desenvolvida em Spring Boot que fornece uma API REST para gerenciamento de uma biblioteca. O projeto implementa operações CRUD (Create, Read, Update, Delete) para entidades de biblioteca utilizando Spring Data JPA.

### Com o que foi construído o app?

- **Java 21** - Linguagem de programação principal
- **Spring Boot 3.5.3** - Framework para desenvolvimento de aplicações Java
- **Spring Data JPA** - Módulo para persistência de dados com JPA
- **PostgreSQL** - Banco de dados relacional
- **Lombok** - Biblioteca para redução de código boilerplate
- **Maven** - Gerenciador de dependências e build

### Porque?

Este projeto foi desenvolvido como parte do curso de Spring Boot, especificamente na Seção 4 - "Acesso a Dados Com Spring Data JPA". O objetivo é demonstrar e praticar os conceitos de:

- JPA Repositories
- Transações
- QueryMethods
- Specifications
- Auditoria
- Projections
- Sorting e Pagination

## Instrução de instalação

### Pré-requisitos

- Java 21 ou superior
- Maven 3.8+
- PostgreSQL 13+
- Git 2.4+

### Configuração do Banco de Dados

1. Instale e configure o PostgreSQL
2. Crie um banco de dados para o projeto
3. Configure as credenciais no arquivo `application.properties`

### Instalação

```bash
# Clone o repositório
git clone https://github.com/darieldonmedeiros/libraryapi.git

# Navegue para o diretório do projeto
cd libraryapi

# Compile o projeto
mvn clean compile

# Execute os testes
mvn test

# Execute a aplicação
mvn spring-boot:run
```

## Instruções de uso

1. A aplicação estará disponível em `http://localhost:8080`
2. Use um cliente REST (como Postman ou Insomnia) para testar os endpoints
3. Os endpoints da API estarão disponíveis em `/api/v1/`

### Exemplos de uso

```bash
# Verificar se a aplicação está rodando
curl http://localhost:8080/actuator/health

# Listar todos os livros (exemplo)
curl http://localhost:8080/api/v1/books
```

## Licença

### Permissão para uso comercial

Este projeto está licenciado sob a MIT License, permitindo uso comercial.

### Olhar e se inspirar

Você pode usar este código como referência para seus próprios projetos.

### Educacional e não profissional

Este projeto foi desenvolvido para fins educacionais como parte de um curso de Spring Boot.

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## Gitflow

### Padrões para contribuição

- **main**: Branch principal com código estável
- **develop**: Branch de desenvolvimento
- **feature/**: Branches para novas funcionalidades
- **hotfix/**: Branches para correções urgentes
- **release/**: Branches para preparação de releases

### Convenções de commit

- `feat:` para novas funcionalidades
- `fix:` para correções de bugs
- `docs:` para documentação
- `style:` para formatação de código
- `refactor:` para refatoração
- `test:` para testes
- `chore:` para tarefas de manutenção

## Contribuidores

### Desenvolvedor Principal

- **Darieldon Medeiros** - Desenvolvimento inicial e estrutura do projeto

### Reconhecimento

- Curso Spring Boot - Seção 4: Acesso a Dados Com Spring Data JPA
- Comunidade Java
