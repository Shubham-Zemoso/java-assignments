package lambdas.lambdaScope;

public class LambdaScope extends SuperScope {
    String member="Grandpa";
    interface Family{
        void who(String member);
    }
    void testMember(String member){
        System.out.println(member);
        System.out.println(this.member);
        System.out.println(super.member);
        Family f=(String familyMember)->{
            System.out.println(familyMember);
            System.out.println(member);
            System.out.println(this.member);
            System.out.println(super.member);

        };
        f.who(member);

    }

    public static void main(String[] args) {
        new LambdaScope().testMember("Father");
    }
}
