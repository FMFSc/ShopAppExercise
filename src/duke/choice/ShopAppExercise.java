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
        double tax;
        double total;
        int measurement;

        tax = 0.2;
        measurement = 3;
        total = 0;

        //total = tax * price;
        System.out.println("Welcome to the Duke Choice Shop");

        Customer c1 = new Customer();

        c1.name = "Pinky";

        System.out.println("Customer name is " + c1.name);

        c1.size = "S";

        switch (measurement)
        {
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";
        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";
        item4.description = "Blue T-shirt";
        item4.price = 10.5;
        item4.size = "S";

        Clothing[] clothingList = new Clothing[4];
        clothingList[0] = item1;
        clothingList[1] = item2;
        clothingList[2] = item3;
        clothingList[3] = item4;

        //just a test 2
        //       System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        //       System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);
        //total = (item1.price + item2.price * 2) * (1 + tax);
        //calculating total with a for each loop
        for (Clothing item : clothingList)
        {
//            System.out.println("Total = " + total);
            if (c1.size.equalsIgnoreCase(item.size) && total <= 15)
            {
                total = total + item.price * (1 + tax);
            }

        }

        System.out.println("Total = " + total);

        for (Clothing item : clothingList)
        {
            System.out.println("Item: " + item.description + ", " + item.price + ", " + item.size);
        }

    }

}
