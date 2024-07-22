package patternDesign.structural.facade;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * Facade pattern hides the complexities of the system and provides an interface to the client using which the client
 * can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface
 * to exiting system to hide its complexities.
 *
 * This pattern involves a single class which provides simplified methods which are required by client and delegates
 * calls to existing system classes methods.
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
