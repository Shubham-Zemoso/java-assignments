package JavaAssignments.Assignment6;

public class ConstructorProgram {
    ConstructorProgram(String name)
    {
        System.out.println("My Name is:"+name);
    }
    public static void main(String args[])
    {
        ConstructorProgram object[]=new ConstructorProgram[5];
        for(int i=0;i<5;i++)
        {
            object[i]=new ConstructorProgram("Shubham");
        }
    }
}
