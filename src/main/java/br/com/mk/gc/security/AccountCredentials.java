package br.com.mk.gc.security;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AccountCredentials implements Serializable {

    private String username;
    private String password;

}
