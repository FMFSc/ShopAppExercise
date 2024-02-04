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
        
        switch ( measurement ){
            case 1, 2, 3:
                System.out.println("Size: S");
                break;
            case 4, 5, 6:
                System.out.println("Size: M");
                break;
            case 7, 8, 9:
                System.out.println("Size: L");
                break;
            default:
                System.out.println("Size: X");
        }
        
        
 //       Clothing item1 = new Clothing();
 //       Clothing item2 = new Clothing();
        
 //       item1.description   = "Blue Jacket";
 //       item1.price         = 20.9;
 //       item1.size          = "M";
 //       item2.description   = "Orange T-shirt";
 //       item2.price         = 10.5;
 //       item2.size          = "S";
 //       
 //       System.out.println("Item 1: " + item1.description + ", "+item1.price +", " +item1.size);
 //       System.out.println("Item 2: " + item2.description + ", "+item2.price +", " +item2.size);
 //       
 //       
 //       total = (item1.price + item2.price*2)*(1+tax);
//        System.out.println("Total = "+ total);
        
    }
    
}
