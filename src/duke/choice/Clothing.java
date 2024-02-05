package duke.choice;

/**
 *
 * @author fellipescirea
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    public final double minPrice;
    public final double taxRate;
    
    //Initiating and defining constants
    {
        minPrice = 10;
        taxRate = 0.2;
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
        return price*taxRate;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        if (price < minPrice) {
            price = minPrice;
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
