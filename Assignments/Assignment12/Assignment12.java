package JavaAssignments.Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Assignment12 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        Supplier<Stream<Student>> streamSupplier = students::stream;

        //task 1
        System.out.println("Task1: Departments in college");
        streamSupplier.get().map(Student::getDept).distinct().forEach(System.out::println);
        System.out.println();

        //task2
        System.out.println("Task2: Names of student enrolled after 2018");
        streamSupplier.get().filter((s) -> s.getBatch() > 2018).map(student -> student.sname).forEach(System.out::println);
        System.out.println();


        //task3
        System.out.println("Task3 : Details of Maile student in comp sci dept");
        streamSupplier.get().filter((s) -> s.getGender().equals("Male") && s.getDept().equals("Computer Science")).forEach(Student::display);
        System.out.println();

        //task4

        System.out.println("Task4 : no of male and female students:");
        Map<String,Long> m=streamSupplier.get().collect(groupingBy(Student::getGender, counting()));
        System.out.println(m);
        System.out.println();
        //TAsk5
        System.out.println("Task 5 : Average age of boys and girls");
        Map<String, Double> mo=streamSupplier.get().collect(groupingBy(Student::getGender,averagingDouble(Student::getAge)));
        System.out.println(mo);
        System.out.println();

        //TAsk6
        System.out.println("Task 6: Student details of highest percentage");
        streamSupplier.get().max(Comparator.comparing(Student::getAggregate)).get().display();
        System.out.println();

        //Task 7
        System.out.println("Task 7: Count the number of students in each department");
        Map<String, Long> studentsPerDept= streamSupplier.get().collect(groupingBy(Student::getDept,counting()));
        System.out.println(studentsPerDept);
        System.out.println();

        //TAsk 8
        System.out.println("Task 8: Average percentage in each department");
        Map<String ,Double> avgperDept=streamSupplier.get().collect(groupingBy(Student::getDept,averagingDouble(Student::getAggregate)));
        System.out.println(avgperDept);
        System.out.println();

        //Task 9
        System.out.println("Task 9: Youngest male student in Electronic dept");
        streamSupplier.get().filter(s->s.getDept().equals("Electronic")&&s.getGender().equals("Male")).min(Comparator.comparingInt(Student::getAge)).get().display();
        System.out.println();

        //Task 10
        System.out.println("Task 10: No of male and female in cse");
        Map<String, Long> studentsInCSE=streamSupplier.get().filter(student -> student.getDept().equals("Computer Science")).collect(groupingBy(Student::getGender,counting()));
        System.out.println(studentsInCSE);
    }
}
