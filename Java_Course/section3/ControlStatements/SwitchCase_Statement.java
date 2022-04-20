package section3.ControlStatements;

public class SwitchCase_Statement {

    public static void main(String[] args) {
        int num = 0;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }
    }
}
