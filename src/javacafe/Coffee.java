package javacafe;

public class Coffee extends Menu{
    
    public Coffee(int id, String name, double price) //Coffee Constructor with 3 Parameters 
    {
        super(id, name, price); //Invoke Super Constructor
    }

    public Coffee(String name, double price, int quantity) //Coffee Constructor with 3 Parameters
    {
        super(name, price, quantity); //Invoke Super Constructor
    }
    
}