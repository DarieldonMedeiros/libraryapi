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

## Aula 11 - Configurando conexão com o banco de dados através da aplicação
* Dependências necessárias (Spring Data JPA, PostgreSQL);
* Troca do `application.properties` para `application.yml`;
* Configuração da URL JDBC (jdbc:postgresql://localhost:5432/library);
* Especificar o `driver-class-name` para que a aplicação se conecte com o banco;

## Aula 12 - Como configurar um DataSource e um Pool de Conexões
* DataSource → Essencial para estabelecer conexão com o banco de dados;
* Configurações presentes no application.yml;
    - spring.datasource.url
    - spring.datasource.username
    - spring.datasource.password
    - spring.datasource.driver-class-name
* Criar um pool de conexões pode melhorar a eficiência e desempenho da aplicação;
* Importante testar a conexão para que tudo ocorra bem;

## Aula 13 - Como mapear entidades JPA
* Criação da Entidade Autor
    - Anotação @Entity para indicar que a classe Autor é uma entidade;
    - Anotação @Table para definir o nome da tabela para Autor;
* Mapeamento da ID
    - Colocando o tipo da variável id como UUID;
    - Utilização da anotação @GeneratedValue para a geração automática do ID;
* Mapeamento de Atributos
    - Nome do autor mapeado com a anotação @Column com restrição de 100 caracteres;
    - Mapeamento da data de nascimento e nacionalidade com restrições;
* Utilização do Lombok
    - Implementação de getters e setters utilizando as anotações @Getter e @Setter;
* Necessário a utilização de um construtor vazio para o funcionamento do JPA;

## Aula 14 - Mapeamento da entidade Livro e utilização do Lombok
* Criação da Entidade Livro
    - Anotação @Entity para indicar que a classe livro é uma entidade;
    - Anotação @Table para definir o nome da tabela para Livro;
* Mapeamentos dos atributos:
    - ID: UUID;
    - ISBN: String (20 caracteres);
    - Titulo: String (150 caracteres);
    - Data de Publicação: LocalDate;
    - Genero: (GeneroLivro) → Classe criada com os gêneros;
    - Preço: Double (Foi mencionado o BigDecimal que tem uma maior precisão, lidando com valores monetários);
* Relacionamento com a entidade Autor:
    - Relacionamento do tipo Many to One (Muitos livros para um autor);
    - Na classe Autor, foi utilizado a relação One to Many (Um autor para vários livros);
* Enumeração para Gênero do Livro:
    - Como mencionado anteriormente, foi criada uma classe chamada GeneroLivro contendo os gêneros dos livros;
    - Na anotação @Enumerated, uma boa prática é colocar o valor EnumType como string, ficando EnumType.STRING
* Utilização do Lombok:
    - Foi apresentada a anotação @Data que contém as seguintes anotações:
      1. @Getter;
      2. @Setter;
      3. @ToString;
      4. @EqualsAndHashCode;
      5. @RequiredArgsConstructor;
