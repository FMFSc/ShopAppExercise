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

        Customer c1 = new Customer("Pinky ", 3);

//        c1.setName("Pinky");
//        c1.setSize(3);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt",10.5, "S");
        Clothing item3 = new Clothing("Green Scarf",5, "S");
        Clothing item4 = new Clothing("Blue T-shirt",10.5, "S");

        //item1.setDescription("Blue Jacket");
        //item1.setPrice(20.9);
        //item1.setSize("M");
        //item2.setDescription("Orange T-shirt");
        //item2.setPrice(10.5);
        //item2.setSize("S");
        //item3.setDescription("Green Scarf");
        //item3.setPrice(5);
        //item3.setSize("S");
        // item4.setDescription("Blue T-shirt");
        //item4.setPrice(10.5);
        //item4.setSize("S");

        Clothing[] items = new Clothing[4];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;

        c1.addItems(items);

        //just a test 2
        //       System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        //       System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);
        //total = (item1.price + item2.price * 2);
        //calculating total with a for each loop
        //System.out.println("Total = " + total);
        System.out.println("Customer name is " + c1.getName() + "and their size is " + c1.getSize() + ", " + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems())
        {
            System.out.println("Item: " + item.getDescription());
        }

    }

}
