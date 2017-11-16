
package servidor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tRetorno.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tRetorno"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PORCENTAJE_GANANCIA"/&gt;
 *     &lt;enumeration value="ENTRADA_GRATIS"/&gt;
 *     &lt;enumeration value="PORCENTAJE_Y_ENTRADAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tRetorno")
@XmlEnum
public enum TRetorno {

    PORCENTAJE_GANANCIA,
    ENTRADA_GRATIS,
    PORCENTAJE_Y_ENTRADAS;

    public String value() {
        return name();
    }

    public static TRetorno fromValue(String v) {
        return valueOf(v);
    }

}
