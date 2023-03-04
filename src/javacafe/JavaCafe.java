package javacafe;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCafe {
public static ArrayList<Menu> products;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee(); //create an odject of type Employee
        Customer c1 = new Customer(); //create an odject of type Customer
        Items i1 = new Items(); //create an odject of type Items
        Products(); //invok Products method to create products
        
        int choice;
        System.out.println("****************************************** Java Cafe ******************************************");
        do
        {
            choicesMessage(); //invoke ChoicesMessage Method to view choices
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1 : //View Menu
                {
                    e1.displayMenu(products); // Display All Proudect in Menu with id, name, price
                    interfaceChoice1(); //invoke interfaceChoice1 Method to view interface for choice 1
                    int m = input.nextInt();
                    switch(m)
                    {
                        case 1 ://Want to see information about proudect
                        {
                            i1.proudectInfo();
                            break;
                        }
                        
                        case 2 ://Not want to see information about proudect
                        {
                            break;
                        }
                        
                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!");  //Wrong Message for Invalid Choice
                            break;
                        }
                        
                    }
                    break;
                }
                
                case 2 : // Order Services 
                {
                    interfaceChoice2(); //Interface to Choice Service (add, Dispay or Cancel Order)
                    int m = input.nextInt();
                    switch (m)
                    {
                        case 1 : // Add Order
                        {
                            e1.addOrder();
                            break;
                        }
                        case 2 : // Display Order
                        {
                            e1.displayOrder();
                            break;
                        }

                        case 3: // Cancel Order
                        {
                            e1.cancelOrder();
                            break;
                        }
                        
                        case 4 : //Back
                        {
                            break;
                        }
                        
                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalid Choice
                            break;
                        }
                    }
                    
                    break;
                }
                
                case 3 : //Print Bill
                {
                    e1.printBill();
                    break;
                }
                
                case 4 : //Customer Service
                {
                    interfaceChoice3(); //Interface to Choice Customer Service (Rate or Payment)
                    int m = input.nextInt();
                    switch(m)
                    {
                        case 1 : //Rate Customer Service
                        {
                            c1.rateService();
                            break;
                        }
                        
                        case 2: //Payment Customer Service
                        {
                            c1.payOrder();
                            break;
                        }
                        case 3 : //Back
                        {
                            break;
                        }
                        
                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalid Choice
                            break;
                        }
                        
                    }
                    break;
                }
                
                default :
                {
                    if(choice !=5)
                    System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalid Choice
                    break;
                }
            }
            
            
        } while(choice != 5); // Exit from system
        
    }
    
    public static void choicesMessage() //Method to Display Choices for System
    {
        System.out.println("");
        System.out.println("[1]View Menu        [2]Order Services       [3]Print Bill       [4]Customer Service     [5]Exit");
        System.out.print("Choice: ");
    }
    
    public static void Products() //Method to create and add object in ArrayList (Products Information)
    {
        products = new ArrayList<Menu>();
        Menu coffee1 = new Coffee(1, "Mocha", 15);  //Polymorphism
        Menu coffee2 = new Coffee(2, "Latte", 18); //Polymorphism
        Menu coffee3 = new Coffee(3, "Black", 5); //Polymorphism

        Menu bakery1 = new Bakery(4, "Bagel", 19); //Polymorphism
        Menu bakery2 = new Bakery(5, "Bread", 6); //Polymorphism
        Menu bakery3 = new Bakery(6, "Donut", 13); //Polymorphism
        
        products.add(coffee1); //Adding element 
        products.add(coffee2); //Adding element 
        products.add(coffee3); //Adding element 

        products.add(bakery1); //Adding element 
        products.add(bakery2); //Adding element 
        products.add(bakery3); //Adding element 
    }
    
    public static void interfaceChoice2() //interface to Choice from Order Services
    {
        System.out.println("[1]Add Order    [2]Display Order     [3]Cancel Order    [4]Back");
        System.out.print("Choice: ");
    }
    
    public static void interfaceChoice3() //interface to Choice from Customer Service
    {
        System.out.println("[1]Rate Customer Service    [2]Payment Customer Service    [3]Back");
        System.out.print("Choice: ");
    }
        
    public static void interfaceChoice1() //interface to Choice if want see more Information about Product
    {
        System.out.println("Want to See information about proudect? ");
        System.out.println("[1]Yes      [2]No");
        System.out.print("Choice: ");
    }
}
