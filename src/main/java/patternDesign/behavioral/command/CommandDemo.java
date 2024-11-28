package patternDesign.behavioral.command;

/**
 * Daniel Nacher
 * 2024-11-28
 *
 * Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped
 * under a object as command and passed to invoker object. Invoker object looks for the appropriate object which can
 * handle this command and pass the command to the corresponding object and that object executes the command.
 *
 * Implementation
 *
 * We've created an interface Order which is acting as a command. We've created a Stock class which acts as a request.
 * We've concrete command classes BuyStock and SellStock implementing Order interface which will do actual command
 * processing. A class Broker is created which acts as a invoker object. It can take order and place orders.
 *
 * Broker object uses command pattern to identify which object will execute which command based on type of command.
 * CommandPatternDemo, our demo class will use Broker class to demonstrate command pattern.
 */
public class CommandDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
