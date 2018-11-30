package br.com.mk.gc.model.enums;

import javax.persistence.AttributeConverter;
import java.io.Serializable;

public enum TipoContaEnum implements BaseEnum {
    CONTA_CORRENTE,
    CONTA_POUPANCA,
    OUTROS;
}
