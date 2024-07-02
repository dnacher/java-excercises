package excercises.appendAndDelete;

/**
 * Daniel Nacher
 * 2024-06-29
 */
public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        if(s.equals(t)) {
            return "Yes";
        }
        int count = 0;
        boolean differentWord = false;
        for(int i=0; i<s.length(); i++) {
            String tString = null;
            String sString = String.valueOf(s.charAt(i));
            if(i<t.length()) {
                tString = String.valueOf(t.charAt(i));
            }
            if(tString==null) {
                count++;
            } else if (!differentWord && !sString.equals(tString)) {
                differentWord = true;
            }
            if(tString!=null && differentWord) {
                count+= 2;
            }
        }

        return count==k ? "Yes" : "No";
    }

    public static String appendAndDeleteVersion2(String s, String t, int k) {
        // Si ambos strings son iguales, la respuesta es "Yes" si k es par o >= 2 veces la longitud de s
        if (s.equals(t)) {
            return k % 2 == 0 || k >= 2 * s.length() ? "Yes" : "No";
        }

        int commonLength = 0;

        // Encuentra la longitud del prefijo común más largo
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }

        // Número total de operaciones necesarias
        int totalOperations = (s.length() - commonLength) + (t.length() - commonLength);

        // Si el número de operaciones necesarias es exactamente k, o si k es mayor que
        // el número de operaciones necesarias y la diferencia es par (para eliminar y agregar caracteres de nuevo)
        if (totalOperations == k || (k >= totalOperations && (k - totalOperations) % 2 == 0) || (k >= s.length() + t.length())) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
