package interfaces;

interface Employee
{
    Employee find(int id);

    //default method
    default boolean isExec(int id)
    {
        return true;
    }

    //static method
    static String getDefaultCountry()
    {
        return "UK";
    }
}
public class DefaultStaticMethods {
    public static void main(String[] args) {
        class EmployeeImpl implements Employee
        {
            public Employee find(int id)
            {
                boolean executive=isExec(id);
                return null;
            }
        }
        EmployeeImpl impl=new EmployeeImpl();
        impl.isExec(123);
        String defaultCountry=Employee.getDefaultCountry();
    }
}
