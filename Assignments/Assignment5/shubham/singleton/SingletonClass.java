package JavaAssignments.Assignment5.shubham.singleton;

public class SingletonClass {
    String member;
    public static  SingletonClass getObject(String member)
    {
        //non-static variable this cannot be referenced from a static context
        //this.member=member;
        SingletonClass object=new SingletonClass();
        object.member=member;
        return object;

    }
    public void printString()
    {
        System.out.println("String: "+member);
    }
}
