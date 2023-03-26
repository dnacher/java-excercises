/**
 * Daniel Nacher
 * 2022-08-08
 */
public class Perro extends Cuadrupedos{

    private Boolean tieneCorrea;

    public void jugar(){
        System.out.println("jugar hueso");
    }

    public Boolean getTieneCorrea() {
        return tieneCorrea;
    }

    public void setTieneCorrea(Boolean tieneCorrea) {
        this.tieneCorrea = tieneCorrea;
    }

    public void comer() {
        System.out.println("comiendo hueso");
    }

    public void sumar(){
        int i= 4;
        int j = 5;
        System.out.println(i+j);
    }
}
