package section3.ControlStatements;

public class Break_Statement {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
