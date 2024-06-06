import java.util.Scanner;

class FoodOrder
{
    Scanner sc = new Scanner(System.in);
    //Mc donald's

    int meals1 = 90;
    int mealm1 = 120;
    int meall1 = 150;
    int meal2 = 179;
    int meal3 = 359;
    int meal4 = 129;
    int meal5 = 199;
    int meal6 = 249;
    int meal7 = 230;
    int meal8 = 385;
    int meal9 = 209;
    int meal10 = 385;
    int meal11 = 205;
    int meal12 = 210;
    int meal13 = 385;
    int meal14s = 90 ;
    int meal14m = 120 ;
    int meal14l = 150 ;
    int meal15s = 120;
    int meal15m = 150;
    int meal15l = 180;

    // Mc cafe

    int mochafrappe = 200;
    int coldcoffee   = 150;
    int americano    = 165;
    int chailatte    = 160;
    int hotchocolate = 180;

    //calcs
	
    int ch;
    int chs;
    int quantity;
    static int total;

    String again;
    String size;

    //generate billS
    public void generateBill()
    {
        System.out.println();
        System.out.println("****** Thankyou for ordering *******");
        System.out.println("****** Your Bill is : " + total + " *******");
    }

}

class mcdonalds extends FoodOrder
{
    public void displayMenu()   // menu for McDonald's
    {
        System.out.println("*********** Welcome To our mcdonald ***********");
        System.out.println("=========================================================================================");
        System.out.println("           1.Mexican chessy fries(S,M,L)                                           120/- ");
        System.out.println("           2.Mcveggie medium meal(medium fries + medium coke)                      179/- ");
        System.out.println("           3.McCheese burger medium meal                                           359/- ");
        System.out.println("           4.Corn and Cheese burger                                                129/- ");
        System.out.println("           5.Cheesy Veg Nuggets                                                    199/- ");
        System.out.println("           6.Mc Cheese Burger                                                      249/- ");
        System.out.println("           7.Mc Spicy Paneer meal                                                  230/- ");
        System.out.println("           8.McSaver Veg Maharaja Mac Meal(Medium Fries + Medium Coke)             385/- ");
        System.out.println("           9.Mexican McAloo Tikki Meal                                             209/- ");
        System.out.println("          10.McTriple cheese burger Meal                                           385/- ");
        System.out.println("          11.McAloo Tikki burger Meal                                              205/- ");
        System.out.println("          12.Big spicy Paneer wrap                                                 210/- ");
        System.out.println("          13.McSpicy Premium Meal                                                  385/- ");
        System.out.println("          14.Coke (S,M,L)                                                           90/- ");
        System.out.println("          15.Fanta Float (S,M,L)                                                   120/- ");
        System.out.println("           0.exit                        	                                             ");
        System.out.println("=========================================================================================");
    }
    public void ordermcd()
    {
        while (true)
        {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:// mexican cheesy fries
                    System.out.println("You have Selected Mexican Cheesy Fries");
                    System.out.println();
                    System.out.println("Enter size (S,M,L)");
                    sc.nextLine();
                    size = sc.nextLine();
                    if(size.equalsIgnoreCase("S"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meals1;
                    }
                    else if(size.equalsIgnoreCase("M"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * mealm1;
                    }
                    else if(size.equalsIgnoreCase("L"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meall1;
                    }
                    else
                    {System.out.println("enter valid choice");}

                    break;
                case 2:// McVeggie meal
                    System.out.println("You have Selected McVeggie Meal");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal2;

                    break;
                case 3:// Mc cheese burger meal
                    System.out.println("You have Selected Mc Cheese ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal3;

                    break;
                case 4:// corn and cheese burger
                    System.out.println("You have Selected Corn and Cheese Burger");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal4;

                    break;
                case 5:// cheesy veg nuggets
                    System.out.println("You have Selected Cheesy Veg Nuggets");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal5;

                    break;
                case 6:// Mc cheese burger
                    System.out.println("You have Selected Mc Cheese Burger");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal6;

                    break;
                case 7://Mc Spicy Paneer
                    System.out.println("You have Selected Mc Spicy Paneer");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal7;

                    break;
                case 8://McSaver Maharaja Mac Deal
                    System.out.println("You have Selected McSaver Maharaja Mac Deal");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal8;

                    break;
                case 9://
                    System.out.println("You have Selected Mexican McAloo Tikki");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal9;

                    break;
                case 10://McTriple cheese burger Meal
                    System.out.println("You have Selected McTriple cheese burger Meal");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal10;

                    break;
                case 11://McAloo Tikki burger Meal
                    System.out.println("You have Selected McAloo Tikki burger Meal ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal11;

                    break;
                case 12://Big spicy Paneer wrap
                    System.out.println("You have Selected Big spicy Paneer wrap ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal12;

                    break;
                case 13://McSpicy Premium Meal
                    System.out.println("You have Selected Coke (S,M,L) ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * meal13;

                    break;
                case 14://Coke (S,M,L)
                    System.out.println("You have Selected Coke (S,M,L)");
                    System.out.println();
                    System.out.println("Enter size (S,M,L)");
                    sc.nextLine();
                    size = sc.nextLine();
                    if(size.equalsIgnoreCase("S"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal14s;
                    }
                    else if(size.equalsIgnoreCase("M"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal14m;
                    }
                    else if(size.equalsIgnoreCase("L"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal14l;
                    }
                    else
                    {System.out.println("enter valid choice");}

                    break;
                case 15://Fanta Float (S,M,L)
                    System.out.println("You have Selected Fanta Float (S,M,L)   ");
                    System.out.println();
                    System.out.println("Enter size (S,M,L)");
                    sc.nextLine();
                    size = sc.nextLine();
                    if(size.equalsIgnoreCase("S"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal15s;
                    }
                    else if(size.equalsIgnoreCase("M"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal15m;
                    }
                    else if(size.equalsIgnoreCase("L"))
                    {
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * meal15l;
                    }
                    else
                    {System.out.println("enter valid choice");}

                    break;
                case 0:// exit
                    System.exit(1);
                    break;

                default:
                    break;

            }

            System.out.println();
            System.out.print("Do you wish to order anything else from MCD(Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {ordermcd();}
            else if(again.equalsIgnoreCase("N"))
            {
                System.out.println("welcome to Mccafe");
                System.out.println("=====================Mc cafe menu-===================");
                System.out.println("           1.Mocha frappe         271/-");
                System.out.println("           2.Cold Coffee          150/-");
                System.out.println("           3.Americano            165/-");
                System.out.println("           4.Chai Latte           160/-");
                System.out.println("           5.Hot Chocolate        210/-");
                System.out.println("           0.exit                      ");
                System.out.println("=====================================================");
                orderMc();
            }
            else{System.out.println("Invalid Choice");}
        }
    }

    //Mc cafe
    public void orderMc()
    {
        sc.nextLine();
        while (true)
        {

            System.out.print("Enter Your Choice ");
            chs = sc.nextInt();
            switch (chs)
            {
                case 1:// Mocha Frappe
                    System.out.println("You have Selected Mocha Frappe");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * mochafrappe ;

                    break;

                case 2:// Cold Coffee
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldcoffee;

                    break;

                case 3 ://  Americano
                    System.out.println("You have Selected Americano");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * americano;

                    break;

                case 4://  Chai Latte
                    System.out.println("You have Selected Chai Latte");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * chailatte;

                    break;

                case 5://  Hot Chocolate
                    System.out.println("You have Selected Hot Chocolate");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * hotchocolate;

                    break;

                case 0:// exit
                    generateBill();
                    System.exit(1);
                    break;

            }

            // ordering
            System.out.println();
            System.out.print("Do you wish to order anything else from Mccafe (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {orderMc();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
                System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
    }
}

// main run class
class order
{
    public static void main(String[] args)
    {
        mcdonalds fo1 = new mcdonalds();
        fo1.displayMenu();
        fo1.ordermcd();
        fo1.orderMc();
	}
}
