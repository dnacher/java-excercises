/**
 * Daniel Nacher
 * 2022-08-08
 */
public class Persona {

    private String pierna;
    private Integer numeroBrazos;
    private String nombre;

    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }

    public String getPierna() {
        return pierna;
    }

    public void setPierna(String pierna) {
        this.pierna = pierna;
    }

    public Integer getNumeroBrazos() {
        return numeroBrazos;
    }

    public void setNumeroBrazos(Integer numeroBrazos) {
        this.numeroBrazos = numeroBrazos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
