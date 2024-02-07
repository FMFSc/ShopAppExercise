package duke.choice;

/**
 *
 * @author fellipescirea
 */
public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @param measurement the size to set
     */
    public void setSize(int measurement) {
        switch (measurement)
        {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public Clothing[] getItems() {
        return items;
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;

    }

    public double getTotalClothingCost() 
    {
        double totalClothingCost = 0.0;
        
        for (Clothing item : items)
        {
                totalClothingCost = totalClothingCost + item.getPrice();


        }

        return totalClothingCost;
    }

}
