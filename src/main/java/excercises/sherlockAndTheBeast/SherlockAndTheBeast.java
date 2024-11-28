package excercises.sherlockAndTheBeast;

/**
 * Daniel Nacher
 * 2024-11-18
 */
public class SherlockAndTheBeast {

    public static String decentNumber(int n) {
        // Write your code here
        if(n<3) {
            return "-1";
        } else {
            int valor = n / 3;
            int valor2 = 0;
            int resto = n % 3;
            boolean encontre = (resto==0)? true : false;
            while (!encontre && resto!=0) {
                --valor;
                if(valor<0 && resto!=0) {
                    return "-1";
                }
                int tot = valor * 3;
                valor2 = n - tot;
                if(valor2%5==0) {
                    encontre = true;
                }
            }
            StringBuilder str = new StringBuilder();
            if(encontre) {
                valor*=3;
            } else {
                return "-1";
            }
            for(int i=0; i<valor; i++) {
                str.append("5");
            }
            for(int i=0; i<valor2; i++) {
                str.append("3");
            }
            return str.toString();
        }
    }
}
