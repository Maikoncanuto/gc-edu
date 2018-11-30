package br.com.mk.gc.model;

import br.com.mk.gc.model.enums.SexoEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_PESSOA")
@AttributeOverride(name = "ID", column = @Column(name = "ID_PESSOA", nullable = false, unique = true))
public class Pessoa extends BaseEntity {

    @Size(max = 250, message = "O campo NOME pode ter no máximo 250 caracteres.")
    @Column(name = "NOME", length = 250, nullable = false)
    private String nome;

    @Size(max = 250, message = "O campo SOBRENOME pode ter no máximo 250 caracteres.")
    @Column(name = "SOBRENOME", length = 250, nullable = false)
    private String sobrenome;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEXO")
    private SexoEnum sexo;

    @OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Documento documento;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Email> emails;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DadoBancario> dadosBancarios;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

}
