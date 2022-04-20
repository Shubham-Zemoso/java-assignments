package JavaAssignments.Assignment7;

interface CycleInterface
{
    public void type();
}
class UnicycleClass implements CycleInterface
{
    @Override
    public void type() {
        System.out.println("Unicycle");
    }
    public static UnicycleClass getUnicycleObject()
    {
        return new UnicycleClass();
    }
}
class BicycleClass implements CycleInterface
{
    @Override
    public void type() {
        System.out.println("Bicycle");
    }
    public static BicycleClass getBicycleObject()
    {
        return new BicycleClass();
    }
}
class TricycleClass implements CycleInterface
{
    @Override
    public void type() {
        System.out.println("Tricycle");
    }
    public static TricycleClass getTricycleObject()
    {
        return new TricycleClass();
    }
}
public class Factories {
    public static void main(String args[])
    {
        CycleInterface cycle=BicycleClass.getBicycleObject();
        cycle.type();
        cycle=UnicycleClass.getUnicycleObject();
        cycle.type();
        cycle=TricycleClass.getTricycleObject();
        cycle.type();
    }
}

/*
Factory method is a creational design pattern which solves the problem of creating product objects
without specifying their concrete classes
Factory design pattern is used to create objects or Class in Java and it provides loose coupling and high cohesion
*/