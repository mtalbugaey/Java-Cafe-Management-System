package javacafe;

public class Menu {
    
    private String name;
    private double price;
    private int id;
    private int quantity;

    public Menu() //No-arg Constructor
    {}

    public Menu(String name) //Menu Constructor with 1 Parameters 
    {
        this.name = name;
    }

    public Menu(String name, double price, int quantity) //Menu Constructor with 3 Parameters 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    

    public Menu(int id, String name, double price) //Menu Constructor with 3 Parameters 
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
