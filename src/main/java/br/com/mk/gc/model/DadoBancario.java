package br.com.mk.gc.model;

import br.com.mk.gc.model.enums.TipoContaEnum;
import lombok.*;
import org.hibernate.annotations.SQLInsert;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_DADO_BANCARIO")
@AttributeOverride(name = "ID", column = @Column(name = "ID_DADO_BANCARIO", nullable = false, unique = true))
public class DadoBancario extends BaseEntity{

    @Size(max = 100, message = "O campo NOME BANCO pode ter no máximo 100 caracteres.")
    @Column(name = "NOME_BANCO", nullable = false, length = 100)
    private String banco;

    @Size(max = 100, message = "O campo NÚMERO AGÊNCIA pode ter no máximo 100 caracteres.")
    @Column(name = "NUMERO_AGENCIA", nullable = false)
    private String numeroAgencia;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_CONTA", nullable = false)
    private TipoContaEnum tipoConta;

    @Size(max = 100, message = "O campo NÚMERO CONTA pode ter no máximo 100 caracteres.")
    @Column(name = "NUMERO_CONTA")
    private String numeroConta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

}
