package patternDesign.structural.proxy;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * In Proxy pattern, a class represents functionality of another class. This type of design pattern comes under
 * structural pattern.
 *
 * In Proxy pattern, we create object having original object to interface its functionality to outer world.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");
        //image will not be loaded from disk
        image.display();
    }
}
