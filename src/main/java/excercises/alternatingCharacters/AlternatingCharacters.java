package excercises.alternatingCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Daniel Nacher
 * 2023-03-13
 *
 * A Shashank le gustan las cadenas donde los caracteres consecutivos son diferentes. Por ejemplo, le gusta , mientras
 * que  no le gusta. Dada una cadena que solamente contiene caracteres  y , él quiere cambiarla a una cadena que le guste.
 * Para hacerlo, solo se le permite borrar los caracteres en la cadena.
 *
 * Tu tarea es encontrar la mínima cantidad requerida de borrados.
 *
 * Formato de Entrada La primera linea contiene un enter  que quiere decir el número de casos de prueba.
 * Luego siguen  lineas , con una cadena en cada linea.
 *
 * Formato de Salida Imprimie la mínima cantidad requerida de pasos en cada caso de prueba.
 *
 * Restricciones
 *
 *
 * Ejemplo de Entrada
 *
 * 5
 * AAAA
 * BBBBB
 * ABABABAB
 * BABABA
 * AAABBB
 * Ejemplo de Salida 00
 *
 * 3
 * 4
 * 0
 * 0
 * 4
 */
public class AlternatingCharacters {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        // Write your code here
        char prevChar = s.charAt(0);
        int total = 0; // total number of deletions required to make the string alternate
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==prevChar ){
                total++;
            }
            prevChar  = s.charAt(i);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                System.out.println(AlternatingCharacters.alternatingCharacters(s));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
