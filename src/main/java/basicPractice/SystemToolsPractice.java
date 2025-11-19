package basicPractice;

public class SystemToolsPractice {
    public static void main(String[] args){
        int[] marks = {2,4,5,9,8};
        int[] marksCopy = new int[5];

        System.arraycopy(marks, 0, marksCopy, 0, marks.length -1);

        System.out.println("the marks array");
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("\nthe marks copy array");
        for(int i =0; i<marksCopy.length; i++){
            System.out.println(marksCopy[i]);
        }
    }
}
