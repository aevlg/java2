package Lesson3.First;

import java.util.Arrays;
public class Run {

    public static void main(String[] args) {


        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};



        FirstTask <Object> firstTask = new FirstTask<>();

        try {
            System.out.println(Arrays.toString(firstTask.swap(sArray, 1, 4)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(firstTask.swap(iArray, 0, 4)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(firstTask.swap(dArray, 0, 4)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }




    }
}

