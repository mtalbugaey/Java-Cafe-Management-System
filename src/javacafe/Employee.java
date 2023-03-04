package javacafe;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Staff {
    Scanner input = new Scanner(System.in);
    private int count = 0; // global count help in add, display, and cancel order + Calc price
    
    
    
    public void displayMenu(ArrayList<Menu> products) //Method to Display Menu
    {
        System.out.println("********* Menu *********");
        System.out.println("ID    NAME      PRICE");
        for (Menu type : products) //iterating ArrayList
        {
            System.out.println(type.getId() + "     " + type.getName() + "     " + type.getPrice());
        }
    }
    
    public void addOrder() //Method for Add Order
    {
        int o;
        
        System.out.println("New Order?");
        System.out.println("[1]yes      [2]any number for no");
        System.out.print("Choice: ");
        int t = input.nextInt();
        switch(t)
        {
            case 1 :
            {
                count = 0; //if new order reste count to zero
                break;
            }
                        
            default : //else no change on count value
                break;
        }
        
        do
        {
            System.out.println("[1]Add from Coffee Type      [2]Add from Bakery Type       [3]Back");
            System.out.print("Choice: ");
            o = input.nextInt();
            
            if(o == 1) // Add From Coffee Type
            {
                int n;
                System.out.println("[1]Mocha   [2]Latte    [3]Black");
                System.out.print("Choice: ");
                n = input.nextInt();
                switch (n)
                {
                    case 1 : //Mocha Type
                    {
                        System.out.print("Enter Mocha Coffee quantity : ");
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Mocha", 15 ,quantity); //creat object with order information 
                        orderList[count] = c; // create the object and initialization it (in Array of object)
                        count++; //if order is add the counter will increment
                        break;
                    }
                    
                    case 2 : //Latte Type
                    {
                        System.out.print("Enter Latte Coffee quantity : "); 
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Latte", 18 ,quantity); //creat object with order information 
                        orderList[count] = c; // create the object and initialization it (in Array of object)
                        count++; //if order is add the counter will increment
                        break;
                    }
                    
                    case 3 : // Black Type
                    {
                        System.out.print("Enter Black Coffee quantity : ");
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Black", 5 ,quantity); //creat object with order information
                        orderList[count] = c; // create the object and initialization it (in Array of object)
                        count++; //if order is add the counter will increment
                        break;
                        
                    }
                    
                    default :
                    {
                        System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalied Choice
                        break;
                    }
                }
            }

        else if(o == 2) // Add From Bakery Type
            {
                int n;
                System.out.println("[1]Bagel   [2]Bread    [3]Donut");
                System.out.print("Choice: ");
                n = input.nextInt();
                switch (n)
                {
                    case 1 ://Bagel Type
                    {
                        System.out.print("Enter Bagel quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Bagel", 19 ,quantity); //creat object with order information
                        orderList[count] = b; // create the object and initialization it (in Array of object)
                        count++; //if order is add the counter will increment  
                        break;
                    }
                    
                    case 2 : //Bread Type
                    {
                        System.out.print("Enter Bread quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Bread", 6 ,quantity); //creat object with order information
                        orderList[count] = b; // create the object and initialization it
                        count++; //if order is add the counter will increment
                        break;
                    }
                    
                    case 3 : //Donut Type
                    {
                        System.out.print("Enter Donut quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Donut", 13 ,quantity); //creat object with order information
                        orderList[count] = b; // create the object and initialization it (in Array of object)
                        count++; //if order is add the counter will increment
                        break;
                        
                    }
                    
                    default :
                    {
                        System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalied Choice
                        break;
                    }
                }
            }
            
        else if (o != 3) 
        {
            System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalied Choice
            break;
        }
            
        } while(o !=3 ); //Back

    }
    
    public void displayOrder() //Method for Display Order
    {
        System.out.println("********************** The Order **********************");
        for(int i = 0; i < count ; i++) //Dispaly all Proudect of order (with ID bill product, name, price, quantity)
        {
            System.out.println((i+1)+ ". Name: " + orderList[i].getName() + "    Price: " + orderList[i].getPrice() + "   Quantity: " + orderList[i].getQuantity());
        }  
    }
    
    public void cancelOrder() //Method for Cancel Order
    {
        int o;
        System.out.println("[1]cancel some Proudect in Order     [2]Back ");
        System.out.print("Choice: ");
        o = input.nextInt();
        switch(o)
        {
            case 1:
            {
                System.out.println("Enter the ID of product in bill to cancel");
                System.out.print("ID of product to remove: "); //Employee will enter number starting from 1
                int remove = input.nextInt();
                for (int i = remove - 1 ; i < count - 1; i++) //(remove - 1) to reach correct index in array 
                {
                    orderList[i] = orderList[i + 1]; //copy next element into this position (shifting)
                }
                
                System.out.println("[1]From Coffee    [2]From Bakery");
                System.out.print("Choice: ");
                int a = input.nextInt();
                switch(a)
                {
                    case 1: //remove product from coffee type
                    {
                        orderList[count - 1] = new Coffee(null, 0.0, 0); //reset the last element in array
                        count--; //decrease the size of object in array
                        break;
                    }
                    
                    case 2: //remove product from bakery type
                    {
                        orderList[count - 1] = new Bakery(null, 0.0, 0); //reset the last element in array
                        count--; //decrease the size of object in array
                        break;
                    }
                    
                    default :
                    {
                        if(a != 1 && a != 2)
                        {
                        System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalied Choice
                        break;
                        }
                    }
                }
                break;
            }
            
            case 2:
            {
                break;
            }
            
            default :
            {
                if(o != 2)
                {
                System.out.println("Wrong Number Try aِgain !!"); //Wrong Message for Invalied Choice
                break;
                }
            }
        }
        if(o == 1)
        {
            System.out.println("");
            System.out.println("Order after Cancel: ");
            displayOrder(); //invoke method to Display Order after cancle
        }
    }
        
    public double calcSubPrice() //Methode for Calc Sub Price
    {
        double price;
        final double TAX = 0.15;
        int subPrice = 0;
        
        for (int i = 0; i < count ; i++) 
        {
           price = (orderList[i].getPrice() * orderList[i].getQuantity());
           subPrice += price;
        }
        
       return  subPrice;
    }
        
    public void printBill() //Methode for Print Bill
    {
        double totalPrice = calcSubPrice() + (calcSubPrice() * 0.15); //Calc Total price
        System.out.println("*********************** Bill **************************");
        System.out.println("Sub Price: " + calcSubPrice() + " SAR");
        System.out.println("Tax: " + "15%" );
        System.out.println("Total Price: " +  totalPrice + " SAR");
        displayOrder(); //invoke Display Order Method 
    }
        
    }