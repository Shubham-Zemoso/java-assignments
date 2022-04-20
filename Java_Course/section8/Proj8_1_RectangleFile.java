package section8;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> r=new ArrayList<>();
        try{
            Scanner dimensions=new Scanner(new File("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\rectangle_data.txt"));
            while(dimensions.hasNext()){
                int length,breadth;
                length= dimensions.nextInt();
                breadth =dimensions.nextInt();
                r.add(new Rectangle(length,breadth));
            }
            dimensions.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        for(Rectangle rectangle:r){
            System.out.println("Length of Rectange : "+rectangle.getLength());
            System.out.println("width of Rectangle : "+rectangle.getWidth());
            System.out.println("Area of Rectangle : "+rectangle.area());
            System.out.println("Perimeter of Rectangle : "+rectangle.perimeter());
        }
    }

}
