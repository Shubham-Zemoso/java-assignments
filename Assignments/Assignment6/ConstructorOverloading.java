package JavaAssignments.Assignment6;

public class ConstructorOverloading {
    ConstructorOverloading(String name)
    {
        this();
        System.out.println("I am "+name);

    }
    ConstructorOverloading()
    {
        System.out.println("This is default Constructor");
    }
    public static void main(String args[])
    {
        ConstructorOverloading object=new ConstructorOverloading("Shubham");
    }
}
