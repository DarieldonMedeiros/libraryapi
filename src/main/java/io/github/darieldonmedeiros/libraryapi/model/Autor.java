package io.github.darieldonmedeiros.libraryapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "autor", schema = "public") // por padrão o schema é public
@Getter // gera os getters automaticamente
@Setter // gera os setters automaticamente
public class Autor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name= "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    // Mapeamento objeto relacional: One to Many → Um autor para vários livros
    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;

}
