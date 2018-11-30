package br.com.mk.gc.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_PERFIL")
public class Perfil extends BaseEntity implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERFIL", unique = true)
    private Long id;

    @Size(max = 40, message = "O campo nome pode ter no máximo 40 caracteres.")
    @Column(name = "NOME", unique = true, length = 40, nullable = false)
    private String nome;

    @Size(max = 200, message = "O campo descrição pode ter no máximo 200 caracteres.")
    @Column(name = "DESCRICAO", length = 200, nullable = false)
    private String descricao;

    @Column(name = "ATIVO")
    private Boolean ativo = true;

    @Override
    public String getAuthority() {
        return getNome();
    }
}
