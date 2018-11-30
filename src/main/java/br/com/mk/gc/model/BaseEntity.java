package br.com.mk.gc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@MappedSuperclass
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @JsonIgnore
    @Column(name = "ATIVO")
    private Boolean ativo = true;

    @JsonIgnore
    @Transient
    public Boolean isPersisted(){
        return Objects.nonNull(this.getId()) && !this.getId().equals(Long.valueOf(0));
    }
}
