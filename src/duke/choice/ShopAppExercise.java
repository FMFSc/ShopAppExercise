package duke.choice;

/**
 *
 * @author fellipescirea
 */
public class ShopAppExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total;
        int measurement;

        measurement = 3;
        total = 0;

        //total = tax * price;
        System.out.println("Welcome to the Duke Choice Shop");

        Customer c1 = new Customer();

        c1.setName("Pinky");

        System.out.println("Customer name is " + c1.getName());

        c1.setSize("S");

        switch (measurement)
        {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");
        item4.setDescription("Blue T-shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        Clothing[] clothingList = new Clothing[4];
        clothingList[0] = item1;
        clothingList[1] = item2;
        clothingList[2] = item3;
        clothingList[3] = item4;

        //just a test 2
        //       System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        //       System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);
        //total = (item1.price + item2.price * 2);
        //calculating total with a for each loop
        for (Clothing item : clothingList)
        {
//            System.out.println("Total = " + total);
            if (c1.getSize().equalsIgnoreCase(item.getSize()) && total <= 15)
            {
                total = total + item.getPrice();
            }

        }

        System.out.println("Total = " + total);

        for (Clothing item : clothingList)
        {
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
        }

    }

}
