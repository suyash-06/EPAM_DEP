// Polymorphism -> Overloading 

class Customer
{
     Customer(int a,int b)
     {
         System.out.println(a+b);
     }
     Customer(String a,String b)
     {
        System.out.println(a+b);
     }
     Customer(int a,int b,int c)
     {
        System.out.println(a+b+c);
     }

     float add(int a,float b)
     {
        return a+b;
     }
     String add( String a, String b)
     {
         return a+b;
     }

}

class Poly
{

  public static void main(String[] args)
  {
     Customer obj1=new Customer(10,20);
     new Customer("SUyash","Gupta");
     System.out.println(obj1.add(20,100));
     System.out.println(obj1.add("xyz","abc"));


  }

}