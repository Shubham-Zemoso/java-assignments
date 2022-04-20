package lambdas;

interface Imovie{
    boolean check(int id);
}

public class MethodReference {
    Imovie m = (id) -> id < 100;
    Imovie m1 = MethodReference::isClassic;
    void testMovie(int id) {
        System.out.println(m.check(id));
        System.out.println( m1.check(id));

    }
    static boolean isClassic(int id){
        return true;
    }

    public static void main(String[] args) {
        new MethodReference().testMovie(100);

    }



}
