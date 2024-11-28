package patternDesign.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-11-28
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
