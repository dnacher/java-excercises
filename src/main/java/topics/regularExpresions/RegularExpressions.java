package topics.regularExpresions;

import org.testng.annotations.Test;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-30
 *
 * Las expresiones regulares en Java se manejan a través de las clases Pattern y Matcher del paquete java.util.regex.
 *
 */
public class RegularExpressions {

    /**
        Esta expresion verifica que el string debe empezar con letras, seguir con alfanumerico y tener entre 8 y 30 caracteres
        ^  dice que comienza el patron
        [] el primer grupo muestra solo letras (mayusculas y minusculas)
        [] el segundo grupo tiene letras y numeros ademas de "_"
        {} las llaves dicen el tamaño del string

        Utiliza la clase Pattern para compilar la expresión regular.
        Utiliza el método matcher del objeto Pattern para crear un Matcher que buscará coincidencias en una cadena de
        texto.
        Matcher tiene los siguientes metodos disponibles matches(), find(), y replaceAll()

    */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    static Pattern pattern = Pattern.compile(regularExpression);

    @Test
    public void startWithNumber() {
        assertEquals(false, pattern.matcher("8").matches());
    }

    @Test
    public void startWithNumber2() {
        assertEquals(false, pattern.matcher("1Samantha").matches());
    }

    @Test
    public void lessThan8() {
        assertEquals(false, pattern.matcher("Julia").matches());
    }

    @Test
    public void correct() {
        assertEquals(true, pattern.matcher("Samantha").matches());
    }

    @Test
    public void correct2() {
        assertEquals(true, pattern.matcher("Samantha_21").matches());
    }

    @Test
    public void correct3() {
        assertEquals(true, pattern.matcher("JuliaZ007").matches());
    }

    @Test
    public void wrongCharacters() {
        assertEquals(false, pattern.matcher("Samantha?10_2A").matches());
    }

    @Test
    public void wrongCharacters3() {
        assertEquals(false, pattern.matcher("Julia@007").matches());
    }

    @Test
    public void wrongCharactersBegining() {
        assertEquals(false, pattern.matcher("_Julia007").matches());
    }

}
