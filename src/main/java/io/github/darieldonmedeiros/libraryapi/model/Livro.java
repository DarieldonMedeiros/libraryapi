package io.github.darieldonmedeiros.libraryapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "livro") // por padrão o schema é public
@Data // É uma anotação que contempla as seguintes anotações do Lombok: Getter, Setter, EqualsAndHashCode, All Args Constructor
public class Livro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "isbn", length = 20, nullable = false)
    private String isbn;

    @Column(name = "titulo", length = 150, nullable = false)
    private String titulo;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero", length = 30, nullable = false)
    private GeneroLivro genero;

    @Column(name = "preco", precision = 18, scale = 2)
    private Double preco;
    // BigDecimal tem uma precisão maior e é utilizado para valores monetários

    // Mapeamento objeto relacional: Many to One → Muitos livros para um autor
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

}
