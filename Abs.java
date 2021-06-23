// Abstract class 

abstract class Draw
{
    Draw()
    {
        System.out.println("ABstract class constructor called");
    }
    abstract void paint();
    static void fun()
    {
        System.out.println("Static method of abstract class called");
    }
}
 
class Rectangle extends Draw
{   

    Rectangle()
    {
        super();
        System.out.println("REctangle constructor");
    }
    void paint()
    {  
        System.out.println("Printing Rectangle");
        }
}
class Abs{

    public static void main(String[] args)
    {
       Rectangle obj=new Rectangle();
       obj.paint();
       Draw.fun();
    }
}