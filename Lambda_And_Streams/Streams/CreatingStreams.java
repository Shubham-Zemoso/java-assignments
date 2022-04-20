package Streams;

import java.util.stream.Stream;

public class CreatingStreams {
    static void generateRandom(){
        Stream<Double> s= Stream.generate(Math::random);
        s.forEach(System.out::println);
    }

    static void iterate(){
        Stream.iterate(1,i->i+1).forEach(System.out::println);
    }



    public static void main(String[] args) {
       // generateRandom();
        iterate();
    }
}
