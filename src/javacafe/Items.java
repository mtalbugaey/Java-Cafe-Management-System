package javacafe;

import java.util.Scanner;

public class Items extends Menu {
    Scanner input = new Scanner(System.in);
    private int calories;
    private String type,origin;

    public Items() //No-arg Constructor
    { }

    public Items(String name, String type, int calories) //Items Constructor with 3 Parameters 
    {
        super(name); //Invoke Super Constructor
        this.type = type;
        this.calories = calories;
    }

    public Items(int calories, String origin, String name) //Items Constructor with 3 Parameters 
    {
        super(name); //Invoke Super Constructor
        this.calories = calories;
        this.origin = origin;
    } 
    

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }
    
    
    public void proudectInfo() //Method for Print Product infotmation
    {
        System.out.print("Enter ID of proudect: ");
        int m = input.nextInt();
        System.out.println("\n********************* Proudect Info *********************");
        switch(m)
        {
            case 1 : //Mocha
            {
                Items i = new Items(197, "Yemen", "Mocha"); //creat object with product information
                System.out.println(i.getName() + "\nPlace of Origin: " + i.getOrigin() + "\nCalories: " + i.getCalories());
                System.out.println("Description: Shot of espresso is combined with a chocolate powder or syrup, followed by milk or cream. It is a variant of a latte");
                break;  
            }
            
            case 2 : //Latte
            {
                Items i = new Items(206, "Italy", "Latte"); //creat object with product information
                System.out.println(i.getName() + "\nPlace of Origin: " + i.getOrigin() + "\nCalories: " + i.getCalories());
                System.out.println("Description: One or two shots of espresso, lots of steamed milk and a final, thin layer of frothed milk on top");
                break;
            }
            
            case 3 : //Black
            {
                Items i = new Items(2, "South Africa", "Black"); //creat object with product information
                System.out.println(i.getName() + "\nPlace of Origin: " + i.getOrigin() + "\nCalories: " + i.getCalories());
                System.out.println("Description: Coffee with no milk, milk substitute, or cream added");
                break;
            }
            
            case 4 : //Bagel
            {
                Items i = new Items("Bagel", "Plain", 250); //creat object with product information
                System.out.println(i.getName() + "\nType: " + i.getType() + "\nCalories: " + i.getCalories());
                System.out.println("Description: Classic soft, chewy and thick New York–style bagel");
                break;
            }
            
            case 5 : //Bread
            {
                Items i = new Items("Bread", "Rye Bread", 67); //creat object with product information
                System.out.println(i.getName() + "\nType: " + i.getType() + "\nCalories: " + i.getCalories());
                System.out.println("Description: Fresh bread made with rye flour serve with chocolate or butter");
                break;
            }
            
            case 6 : //Donut
            {
                Items i = new Items("Donut", "Classic", 190); //creat object with product information
                System.out.println(i.getName() + "\nType: " + i.getType() + "\nCalories: " + i.getCalories());
                System.out.println("Description: Shaped yeast-leavened roll characterized by a crisp, shiny crust and a dense interior");
                break;
            }
            
            default :
            {
                System.out.println("Invalid Number, Try Again!!"); //Wrong Message for Invalied Choice
                break;
            }
        }
        
    }
    
}
