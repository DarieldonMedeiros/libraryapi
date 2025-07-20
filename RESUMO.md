# Seção 4: Acesso a Dados Com Spring Data JPA

## Aula 01 - Introdução ao Spring Data JPA
* Spring Data JPA - Módulo do Spring Boot que trabalha com o JPA
  - JPA Repositories (Utiliza o EntityManager)
  - Transações (controle transacional)
  - QueryMethods (Permite que crie o código SQL automaticamente)
  - Specifications (Forma de escrever código reutilizável)
  - Auditoria (Guardar dados de atualização)
  - Projections (Facilita o retorno das consultas)
  - Sorting e Pagination (Ordenação e Paginação)
* JPA - Java Persistence API (Implementação mais famosa: Hibernate)
  - Banco de dados (MySQL, PostgreSQL, ...)
  - Data Source (Fonte de dados necessária para comunicar com o BD)
  - EntityManagerFactory (Fábrica de EntityManager)
  - EntityManager (objeto principal do JPA)
  - Operações (faz o caminho entre o EntityManager e o Entity)
  - Entidades (são os objetos de negócio para fazer o mapeamento objeto relacional)
  - Tabela (cada tabela se relaciona com uma entidade)

## Aula 02 - Criação e configuração do Projeto
* Criação do projeto libraryapi utilizando o start.spring.io com as seguintes dependências:
  - Spring Data JPA;
  - Lombok;
  - PostgreSQL Driver;