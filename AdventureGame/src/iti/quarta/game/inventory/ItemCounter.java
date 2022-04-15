package iti.quarta.game.inventory;

/**
 * Allow the count of items inside our inventory.
 */
public class ItemCounter {
    private final Item item;
    private int counter = 1;

    public ItemCounter(Item item) {
        this.item = item;
    }
    
    public ItemCounter(Item item, int counter) {
    	this.item = item;
    	this.counter = counter;
    }

    /**
     * Increase how many items of the instance in the constructor you're holding.
     */
    public void increase() {
        this.counter++;
    }

    /**
     * Decrease the item, if less than zero, throws an exception.
     * @throws ItemLessThanOne
     */
    public void decrease() throws ItemLessThanOne {
        this.counter--;
        if (this.counter < 1) {
            throw new ItemLessThanOne();
        }
    }

    public int getCounter() {
        return counter;
    }

    public Item getItem() {
        return item;
    }
}
