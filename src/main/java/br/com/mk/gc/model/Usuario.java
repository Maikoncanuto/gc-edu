package br.com.mk.gc.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Collection;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_USUARIO")
public class Usuario extends BaseEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Size(max = 150, message = "O campo username pode ter no máximo 150 de tamanho.")
    @Column(name = "USERNAME", length = 150, unique = true, nullable = false)
    private String username;

    @Size(max = 250, message = "O campo nome pode ter no máximo 250 de tamanaho.")
    @Column(name = "NOME", length = 250, nullable = false)
    private String name;

    @Size(max = 250, message = "O campo e-mail pode ter no máximo 250 de tamanho.")
    @Email
    @Column(name = "EMAIL", unique = true, nullable = false, length = 250)
    private String email;

    @Size(max = 255, message = "O campo senha pode ter no máximo 255 de tamanho.")
    @Column(name = "PASSWORD", length = 255, nullable = false)
    private String password;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_USUARIO_PERFIL",
        joinColumns = {@JoinColumn(name = "ID_USUARIO")},
        inverseJoinColumns = {@JoinColumn(name = "ID_PERFIL")})
    private Collection<Perfil> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getAuthorities();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return getAtivo();
    }
}
