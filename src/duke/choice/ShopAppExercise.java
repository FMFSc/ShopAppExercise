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

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        Clothing[] clothingList = new Clothing[2];
        clothingList[0] = item1;
        clothingList[1] = item2;
        
        //just a test

        System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);

        total = (item1.price + item2.price * 2) * (1 + tax);
        System.out.println("Total = " + total);
        
        

    }

}
