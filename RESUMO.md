# Seção 4: Acesso a Dados Com Spring Data JPA

## Aula 01 - Introdução ao Spring Data JPA
* Spring Data JPA - Módulo do Spring Boot que trabalha com o JPA
  - JPA Repositories (Utiliza o EntityManager);
  - Transações (controle transacional);
  - QueryMethods (Permite que crie o código SQL automaticamente);
  - Specifications (Forma de escrever código reutilizável);
  - Auditoria (Guardar dados de atualização);
  - Projections (Facilita o retorno das consultas);
  - Sorting e Pagination (Ordenação e Paginação);
* JPA - Java Persistence API (Implementação mais famosa: Hibernate)
  - Banco de dados (MySQL, PostgreSQL, ...);
  - Data Source (Fonte de dados necessária para comunicar com o BD);
  - EntityManagerFactory (Fábrica de EntityManager);
  - EntityManager (objeto principal do JPA);
  - Operações (faz o caminho entre o EntityManager e o Entity);
  - Entidades (são os objetos de negócio para fazer o mapeamento objeto relacional);
  - Tabela (cada tabela se relaciona com uma entidade);

## Aula 02 - Criação e configuração do Projeto
* Criação do projeto libraryapi utilizando o start.spring.io com as seguintes dependências:
  - Spring Data JPA;
  - Lombok;
  - PostgreSQL Driver;

## Aula 03 - Importante - alinhando a versão do Projeto com a do Curso
* Alteração dos seguintes arquivos:
  - LibraryApiApplication -> Application;
  - LibraryApiAppicationTests -> ApplicationTests;
  - Editando o pom.xml para ficar de fácil entendimento;

## Aula 04 - Construindo o ambiente de Banco de Dados PostgreSQL
* Explicando a utilização do docker (para criar uma instância do PostgreSQL):
  - Possui vantagens em relação à instalação de banco de dados na máquina local
  - Download da imagem do PostgreSQL via docker

## Aula 05 - Subindo uma instância do client do PostgreSQL (Pgadmin4) no Docker
* Pgadmin4 é o principal gerenciador do PostgreSQL
  - Instalação via docker;
  - Configurações de Rede;
  - Configurações de Portas;
  - Conexão ao banco de dados PostgreSQL;

## Aula 06 - Criando uma network para conectar os containers
* Importância da Network (para que o PostgreSQL e PgAdmin4 se conectem)
* Criação da Network (docker create network library-network)
* Como parar os containers utilizando docker stop nomeDoContainer
* Recriação dos containers adicionando a flag --network
* Através do Network é capaz de conseguir se conectar

## Aula 07 - Solucionando problemas que podem ocorrer com o ambiente no Docker
* Verificar disponibilidade da porta utilizada;
* Execução em segundo plano. (Utilizar a flag -d);
* Rede no docker (docker network create);
* Revisão das configurações;

## Aula 08 - Instalação do PostgreSQL na máquina (Opcional: para quem não tem Docker)
* Acesso ao site do PostgreSQL;
* Escolha, download e execução do Instalador (Depende do Sistema Operacional);
* Configuração da Instalação (definir usuário e senha para postgres);

## Aula 09 - Modelagem das tabelas do banco de dados
* Estruturação das tabelas (livro e autor);
* Definição dos campos (tipos de dados);
* Relacionamento (um autor pode ter escrito vários livros);
* Processo de criação via SQL;
* Utilização das ferramentas;

## Aula 10 - Criando e rodando os scripts no banco de dados
* Conexão ao banco de dados (PgAdmin e PostgreSQL);
* Criação dos bancos das tabelas via SQL (autor e livro);