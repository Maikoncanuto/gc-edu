package br.com.mk.gc.model;

import br.com.mk.gc.model.enums.SexoEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

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

    @Size(max = 200, message = "O campo PROFISSÃO pode ter no máximo 200 caracteres.")
    @Column(name = "PROFISSAO", nullable = true, length = 200)
    private String profissao;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEXO")
    private SexoEnum sexo;

    @OneToOne(mappedBy = "pessoa", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DocumentoPessoal documento;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Email> emails;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Endereco> enderecos;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Telefone> telefones;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DadoBancario> dadosBancarios;

    @MapsId
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

}
