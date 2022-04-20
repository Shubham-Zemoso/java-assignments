package JavaAssignments.Assignment8;

import java.util.Scanner;

class EvenNumberException extends Exception
{
    EvenNumberException(String exception)
    {
        super(exception);
    }
}
class NumberEqualToZero extends Exception
{
    NumberEqualToZero(String exception)
    {
        super(exception);
    }
}
class OddNumberException extends Exception
{
    OddNumberException(String exception)
    {
        super(exception);
    }
}
public class Assignment8 {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print(("Enter a number: "));
        num = sc.nextInt();

        try
        {
            if(num==0)
                throw new NumberEqualToZero("Number is equal to zero");
            if(num%2!=0)
                throw new OddNumberException("Number is a odd number");
            if(num%2==0)
                throw new EvenNumberException("Number is a even number");
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            System.out.println("Block Executed");
        }
    }
}
