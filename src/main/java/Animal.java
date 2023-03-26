/**
 * Daniel Nacher
 * 2022-08-08
 */
public class Animal {

    public static String variable = "esta es estatica";

    private Integer patas;

    public void comer() {
        System.out.println("comiendo Animal");
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Animal(Integer patas) {
        this.patas = patas;
    }
}
