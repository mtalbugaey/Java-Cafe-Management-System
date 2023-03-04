package javacafe;
import java.util.Scanner;

public class Customer extends Staff {
    Scanner input = new Scanner(System.in);
    
    public void rateService() //Rate Service Method
    {
        int rate;
        boolean continu = false;
        do
        {
            System.out.println("How do you rate our customer service?");
            System.out.println("[1]Excellent    [2]Average      [3]Poor");
            System.out.print("Choice: ");
            rate = input.nextInt();
            
            switch(rate)
            {
                case 1 : //Excellent
                case 2 : //Average
                case 3 : //Poor
                {
                    System.out.println("Thanks for rating, this will help us to improve our service"); //Thanks Message for Valid Choice
                    continu = true;
                    break;
                }
            
                default : //Enter Invalid number
                {
                    if (rate != 1 && rate != 2 && rate !=3)
                    {
                        System.out.println("invalied number, Try again"); //Wrong Message for Invalid Choice
                        break;
                    }
                }
            
            }
        } while (continu == false);
    }
    
    public void payOrder()
    {
        int p;
        boolean continu = false;
        do
        {
            System.out.println("[1]Pay for Order    [2]Back");
            System.out.print("Choice: ");
            p = input.nextInt();
            
            switch(p)
            {
                case 1 : //Pay for Order
                {
                    System.out.println("successful payment?");
                    System.out.println("[1]yes     [2]No");
                    System.out.print("Choice: ");
                    int f = input.nextInt();
                    switch (f)
                    {
                        case 1 : //yes
                        {
                            System.out.println("Thanks for Purchasing");//Successful Message
                            break;
                        }
                        
                        case 2 : //No
                        {
                            System.out.println("Unsuccessful Payment, Try again");//Failed Message
                            break;
                        }
                    }
                    continu = true;
                    break;
                }
                
                case 2 : //Back
                {
                    continu = true;
                    break;
                }
            
                default : //Enter Invalid number
                {
                    if (p != 1)
                    {
                        System.out.println("invalied number, Try again"); //Wrong Message for Invalid Choice
                        break;
                    }
                }
            
            }
        } while (continu == false);
        
    }

}
