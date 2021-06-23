// Inheritance

class Epam
{
   protected String name;
   protected int age;
   protected double salary;

   Epam(String name, int age, double salary)
   {
       this.name=name;
       this.age=age;
       this.salary=salary;
   }

   String getName()
   {
       return this.name;
   }

   int getAge()
   {
       return this.age;
   }

   double getSalary()
   {
       return this.salary;
   }
 

}


class Java extends Epam 
{
    Java(String name, int age,double salary)
    {
        super(name,age,salary);
    }
} 

class DEP extends Epam
{   
    private double bonus;

    DEP(String name, int age,double salary,double bonus)
    {
        super(name,age,salary);
        this.bonus=bonus;
    }

    double getBonus()
    {
        return this.bonus;
    }
}

class Inheritance
{
   public static void main(String[] args)
   {
     DEP obj1=new DEP("XYZ",21,45000,30000);
     System.out.println(obj1.getName());
     System.out.println(obj1.getAge());
     System.out.println(obj1.getBonus());
     System.out.println(obj1.getSalary());

     Java obj2=new Java("ABC",22,43000);
     System.out.println(obj2.getName());
     System.out.println(obj2.getAge());
     System.out.println(obj2.getSalary());

   }


}