package duke.choice;

/**
 *
 * @author fellipescirea
 */
public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    public final static double MIN_PRICE = 10.0;
    public final static double MIN_TAX = .2;

    //Initiating and defining constants
//    {
//      MIN_PRICE = 10;
//      MIN_TAX = 0.2;
//    }
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.size = size;
    }

    public Clothing(double price) {
        this.price = price;
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
        return price * (1 + MIN_TAX);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
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
