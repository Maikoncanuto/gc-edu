package br.com.mk.gc.model;

import br.com.mk.gc.model.enums.TipoTelefoneEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TB_TELEFONE")
@AttributeOverride(name = "ID", column = @Column(name = "ID_TELEFONE", nullable = false, unique = true))
public class Telefone extends BaseEntity {

    @Size(max = 3, message = "O campo DDD pode ter no máximo 3 caracteres.")
    @Column(name = "DDD", nullable = false, length = 3)
    private String ddd;

    @Size(max = 15, message = "O campo NÚMERO TELEFONE pode ter no máximo 15 caracteres.")
    @Column(name = "NUMERO_TELEFONE", nullable = false, length = 15)
    private String numeroTelefone;

    @Size(max = 100, message = "O campo NOME OPERADORA pode ter no máximo 100 caracteres.")
    @Column(name = "NOME_OPERADORA", nullable = false, length = 100)
    private String operadora;

    @Size(max = 100, message = "O campo TIPO TELEFONE pode ter no máximo 100 caracteres.")
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_TELEFONE", length = 100)
    private TipoTelefoneEnum tipoTelefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;
}
