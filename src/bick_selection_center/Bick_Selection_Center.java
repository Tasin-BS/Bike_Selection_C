
package bick_selection_center;

import java.util.*;  

public class Bick_Selection_Center {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to Bick Selection Center *** ");
        System.out.println("");
        System.out.println("Available Bick's are :");
        System.out.println("Bike names                             Price    ");
        System.out.println("1 .Yamaha MT 15 V2                     3.60 Lakh");
        System.out.println("2 .Royal Enfield Classic 350           4.50 Lakh");
        System.out.println("3 .Royal Enfield Hunter 350            5.65 Lakh");
        System.out.println("4 .Yamaha R15 V4                       3.55 Lakh");
        System.out.println("5 .Bajaj Pulsar NS200                  2.80 Lakh");
        System.out.println("");
        System.out.println("Choose a Bick number for purchase : ");
        int num = input.nextInt();
        Orderdetails order = new Orderdetails();
        if(num == 1)
        {
            order.setname("Yamaha MT 15 V2");
            order.setcost(360000);
        }
        else if(num == 2)
        {
            order.setname("Royal Enfield Classic 350");
            order.setcost(450000);
        }
        else if(num == 3)
        {
            order.setname("Royal Enfield Hunter 350");
            order.setcost(565000);
        }
        else if(num == 4)
        {
            order.setname("Yamaha R15 V4");
            order.setcost(355000);
        }
        else
        {
            order.setname("Bajaj Pulsar NS200");
            order.setcost(280000);
        }
        System.out.println("Available Colors are :");
        System.out.println("1. Red  2.Black  3.white");
        System.out.println("");
        System.out.println("Choose a Color for your Bick : ");
        
        int color = input.nextInt();
        
        if(color == 1)
        {
            order.setcolor("RED");
        }
        else if(color == 2)
        {
             order.setcolor("Black");
        }
        else
        {
             order.setcolor("White");
        }
        
        System.out.println("Do you to purchase additional features? Type yes or no :");
        
        String st = input.next();
        
        
        if("yes".equals(st))
        {
            System.out.println("Additional Features are : ");
            System.out.println("1. Add Breaking Features");
            System.out.println("2. Add Engine Features");
            System.out.println("3. Add Bike Categories");
            System.out.println("");
            System.out.println("Choose which Feature you want to Add :");
            int fea = input.nextInt();
            if(fea == 1)
            {
                System.out.println("1.Abs  2.Singel disk  3.Double Disk");
                System.out.println("Choose a number to add this feature :");
                int n = input.nextInt();
                if(n == 1)
                {
                    order.setfeature1("Abs");
                    order.setfea_cost(25000);
                }
                else if(n == 2)
                {
                     order.setfeature1("Singel disk");
                     order.setfea_cost(25000);
                }
                else
                {
                     order.setfeature1("Double disk");
                     order.setfea_cost(25000);
                }
            }
            else if(fea == 2)
            {
                System.out.println("1.Fi  2.Oil Cool");
                int n = input.nextInt();
                if(n == 1)
                {
                    order.setfeature2("Fi");
                    order.setfea_cost(25000);
                }
                else if(n == 2)
                {
                     order.setfeature2("Oil Cool");
                     order.setfea_cost(25000);
                }
            }
            else
            {
                System.out.println("1.Super Bick  2.Commutor Bick");
                int n = input.nextInt();
                if(n == 1)
                {
                    order.setfeature3("Super Bick");
                    order.setfea_cost(50000);
                }
                else if(n == 2)
                {
                     order.setfeature3("Commutor");
                     order.setfea_cost(25000);
                }
            }
            System.out.println("");
            order.Display();
        }
        else
        {
            System.out.println("");
            order.Display();
        }
        System.out.println("");
    }
}
