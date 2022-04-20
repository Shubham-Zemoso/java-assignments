package interfaces;

interface Engine
{
    default String make()
    {
        return "default engine";
    }
}

interface Vehicle extends Engine
{
    default String model(int id)
    {
        return "default engine";
    }
}

//Multiple Inheritance
class CaR implements Engine,Vehicle
{
    public String model(int id)
    {
        //return "default car";
        return Vehicle.super.model(id);
    }
    String getModel(int id)
    {
        return model(id);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

    }
}
