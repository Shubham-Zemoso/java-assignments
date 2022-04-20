package section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Rock");
        sb.append(" Johnson");
        System.out.println(sb);
        sb.insert(7,"name ");
        System.out.println(sb);
        sb.replace(7,14,"kl");
        System.out.println(sb);
        StringBuilder teacherName=new StringBuilder("John Baugh");
        teacherName.replace(0,4,"Dr");
        System.out.println(teacherName);
    }
}
