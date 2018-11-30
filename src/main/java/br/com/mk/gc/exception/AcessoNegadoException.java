package br.com.mk.gc.exception;

import lombok.*;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AcessoNegadoException extends RuntimeException {

    private List<String> messages = new LinkedList<>();

    public AcessoNegadoException(){
        super();
    }

    public AcessoNegadoException(final String msg){
        this.messages.add(msg);
    }

    public AcessoNegadoException(final List<String> lista){
        this.messages = lista;
    }

    public void addMensagem(final String msg){
        this.messages.add(msg);
    }
}
