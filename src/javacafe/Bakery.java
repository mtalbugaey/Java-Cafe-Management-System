package javacafe;

public class Bakery extends Menu {
    
    public Bakery(int id, String name, double price) //Bakery Constructor with 3 Parameters  
    {
        super(id, name, price); //Invoke Super Constructor
    }

    public Bakery(String name, double price, int quantity)  //Bakery Constructor with 3 Parameters  
    {
        super(name, price, quantity); //Invoke Super Constructor
    }
    
}
