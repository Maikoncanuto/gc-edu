package br.com.mk.gc.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_ENDERECO")
@AttributeOverride(name = "ID", column = @Column(name = "ID_ENDERECO", nullable = false, unique = true))
public class Endereco extends BaseEntity{

    @Size(max = 40, message = "O campo CEP pode ter no máximo 40 caracteres.")
    @Column(name = "CEP", length = 40)
    private String cep;

    @Size(max = 200, message = "O campo ENDERECO pode ter no máximo 200 caracateres.")
    @Column(name = "ENDERECO", nullable = false, length = 200)
    private String endereco;

    @Size(max = 200, message = "O campo CIDADE pode ter no máximo 200 caracteres.")
    @Column(name = "CIDADE", nullable = false, length = 200)
    private String cidade;

    @Size(max = 100, message = "O campo ESTADO pode ter no máximo 100 caracteres.")
    @Column(name = "ESTADO", nullable = false, length = 100)
    private String estado;

    @Size(max = 100, message = "O campo PAÍS pode ter no máximo 100 caracteres.")
    @Column(name = "PAIS", nullable = false, length = 100)
    private String pais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;
}
