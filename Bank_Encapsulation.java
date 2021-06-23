// Encapsulation 
 
 class Bank
{
    private String name;
    private double balance;

     Bank(String name, double balance)
    {
        this.name=name;
        this.balance=balance;
    }

    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public double deposit(double amount)
    {
        if(amount>0)
        {
            this.balance=this.balance+amount;
        }
        return 0;
    }
    public double withdraw(double amount)
    {
        if(amount<=this.balance)
        {
            this.balance=this.balance-amount;
        }
        return 0;
    }
}

public class Bank_Encapsulation
{
    public static void main(String [] args)
    {
        Bank obj=new Bank("SUyash",10000);
        System.out.println(obj.getBalance());
        System.out.println(obj.getName());

        obj.deposit(5000);
        obj.withdraw(3000);

        System.out.println(obj.getBalance());



    }

 

}
