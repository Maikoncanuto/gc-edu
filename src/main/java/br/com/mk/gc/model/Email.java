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
@Entity(name = "TB_EMAIL")
@AttributeOverride(name = "ID", column = @Column(name = "ID_EMAIL", nullable = false, unique = true))
public class Email extends BaseEntity {

    @Size(max = 200, message = "O campo ENDERECO EMAIL pode ter no máximo 200 caracteres.")
    @Column(name = "ENDERECO_EMAIL", nullable = false, unique = true, length = 200)
    private String email;

    @Column(name = "EMAIL_PRINCIPAL")
    private Boolean emailPrincipal = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;
}
