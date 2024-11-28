package patternDesign.behavioral.command;

/**
 * Daniel Nacher
 * 2024-11-28
 */
public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
