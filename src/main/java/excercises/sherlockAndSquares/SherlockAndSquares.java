package excercises.sherlockAndSquares;

/**
 * Daniel Nacher
 * 2024-06-05
 *
 * Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
 *
 * Note: A square integer is an integer which is the square of an integer, e.g. 1,4, 9, 16, 25.
 *
 * Example
 * a = 24
 * b = 49
 *
 * There are three square integers in the range:25, 36  and 49. Return 3.
 */
public class SherlockAndSquares {

    public static int squares(int a, int b) {
        // Write your code here
        Long time = System.currentTimeMillis();
        int total = 0;
        for(int i=a; i<=b; i++) {
            double sqrt = Math.sqrt(i);
            if(sqrt== Math.floor(sqrt)) {
                total++;
            }
        }
        System.out.println((System.currentTimeMillis() - time) / 10);
        return total;
    }

    /**
     * Para mejorar la eficiencia, en lugar de iterar sobre todos los números en el rango [a, b] y comprobar si cada
     * número es un cuadrado perfecto, podemos utilizar propiedades matemáticas para reducir significativamente el
     * número de iteraciones.
     *
     * En lugar de verificar cada número en el rango, como hicimos en la version 1 podemos:
     *
     * Encontrar el primer entero x tal que x^2 es mayor o igual a A.
     * Encontrar el último entero y tal que y^2 es menor o igual a B.
     * Contar todos los enteros entre x y y (inclusive), ya que estos representarán los cuadrados perfectos entre a y b.
     * */
    public static int squaresV2(int a, int b) {
        Long time = System.currentTimeMillis();
        int lowerBound = (int) Math.ceil(Math.sqrt(a));
        int upperBound = (int) Math.floor(Math.sqrt(b));

        if (lowerBound > upperBound) {
            return 0;
        }

        System.out.println((System.currentTimeMillis() - time) / 10);
        return upperBound - lowerBound + 1;

    }

}
