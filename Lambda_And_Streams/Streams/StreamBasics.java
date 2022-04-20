package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
    List<Employee> e;
    StreamBasics(List<Employee> e){
        this.e=e;

    }
    void basics(){
        Stream<Employee> empstream=e.stream();
        System.out.println("Employee details");
        //  Filtering
        //  empstream.filter(s->s.empId==100).forEach(s-> System.out.println(s.empName));
        //  mapping
        //  empstream.map(s->s.empId).forEach(System.out::println);
        //empstream.map(s->s.empName).limit(2).forEach(System.out::println);

        //collecting
        List<String> names=empstream.map(s->s.empName).collect(Collectors.toList());
        System.out.println(names.toString());
    }

    public static void main(String[] args) {
        List<Employee> e=new ArrayList<>();
        e.add(new Employee("Shubham",100,"dev intern"));
        e.add(new Employee("Harry",101,"Associate software engineer"));
        e.add(new Employee("Max",102,"Software engineer-1"));
        StreamBasics s =new StreamBasics(e);
        s.basics();
    }
}
