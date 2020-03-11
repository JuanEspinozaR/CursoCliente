
package com.escuela.digital.curso.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para categoria.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="categoria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROGRAMACION"/>
 *     &lt;enumeration value="DISEÑO_GRAFICO"/>
 *     &lt;enumeration value="DISEÑO_WEB"/>
 *     &lt;enumeration value="BASE_DE_DATOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoria")
@XmlEnum
public enum Categoria {

    PROGRAMACION,
    DISEÑO_GRAFICO,
    DISEÑO_WEB,
    BASE_DE_DATOS;

    public String value() {
        return name();
    }

    public static Categoria fromValue(String v) {
        return valueOf(v);
    }

}
