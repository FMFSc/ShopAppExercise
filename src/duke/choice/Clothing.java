package duke.choice;

/**
 *
 * @author fellipescirea
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    
    private final double MIN_PRICE;
    private final double MIN_TAX;
    
    //Initiating and defining constants
    {
        MIN_PRICE = 10;
        MIN_TAX = 0.2;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price*MIN_TAX;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        if (price < MIN_PRICE) {
            price = MIN_PRICE;
        }
        this.price = price;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

}
