package section4;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int counter = 0; counter < 10; counter++) {
            arr[counter] = counter + 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
