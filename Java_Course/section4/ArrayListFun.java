package section4;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList =new ArrayList<String>();
        nameList.add("Max");
        nameList.add("John");
        nameList.add("Kevin");
        for(int i=0;i< nameList.size();i++){
            System.out.println(nameList.get(i));
        }
        for(String name:nameList){
            System.out.println(name);
        }
    }
}
