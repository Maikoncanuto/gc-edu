package br.com.mk.gc.model;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_DOCUMENTO_PESSOA")
@AttributeOverride(name = "ID", column = @Column(name = "ID_DOCUMENTO_PESSOA"))
@EqualsAndHashCode(callSuper = false)
public class DocumentoPessoal extends BaseEntity {

    @CPF
    @Size(max = 20, message = "O campo CPF pode ter no máximo 20 caracteres.")
    @Column(name = "CPF", nullable = false, unique = true, length = 20)
    private String cpf;

    @Size(max = 40, message = "O campo RG pode ter no máximo 40 caracteres.")
    @Column(name = "RG", nullable = false, unique = false, length = 40)
    private String rg;

    @Size(max = 100, message = "O campo ORGÃO EXPEDIDOR pode ter no máximo 100 caracteres.")
    @Column(name = "ORGAO_EXPEDIDOR", length = 100)
    private String orgaoExpedidor;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EXPEDICAO")
    private Date dataExpedicao;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EMISSAO")
    private Date dataEmissao;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

}
