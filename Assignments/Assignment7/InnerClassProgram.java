package JavaAssignments.Assignment7;

class OuterClass
{
    static class InnerClass
    {

        public InnerClass(String myname)
        {
            System.out.println("My name is :"+myname);
        }
    }
}
class SecondClass
{
    class SecondInnerClass extends OuterClass.InnerClass {
        SecondInnerClass(String name) {
            super(name);
        }
    }

    void display(String string)
    {
        SecondInnerClass secondInnerClass = new SecondInnerClass(string);
    }

}
public class InnerClassProgram {
    public static void main(String args[])
    {
        SecondClass secondClass = new SecondClass();
        secondClass.display("Shubham");

    }
}
