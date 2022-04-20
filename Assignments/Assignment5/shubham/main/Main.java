package JavaAssignments.Assignment5.shubham.main;

import JavaAssignments.Assignment5.shubham.data.DataClass;
import JavaAssignments.Assignment5.shubham.singleton.SingletonClass;

public class Main {
    public static void main(String args[])
    {
        DataClass dataobject=new DataClass();
        dataobject.localVariables();
        dataobject.printValues();
        SingletonClass singletonobject= SingletonClass.getObject("Shubham");
        singletonobject.printString();
    }
}
