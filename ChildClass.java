package AtmProject;
public class ChildClass extends Operations {
    
    public void welcomeAtm()
    {
        System.out.println("Welcome to the ATM Project!");
        System.out.print("Enter Your Customer Number: ");
    }
    
    public void checkingAccount(int mainchoice)
    {
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
    }
    
    public void innerChoice(int innerChoice)
    {
        switch(innerChoice)
        {
            case 1 :
                Operations o = new Operations();
                o.viewBalance(viewbalance);
        }
    }

}

