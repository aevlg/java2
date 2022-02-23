package Lesson3.First;

public class FirstTask  <T> {


        T intermediate;

        public  T[] swap(T[] array, int A, int B){
            intermediate = array[A];
            array[A] = array[B];
            array[B] = intermediate;
            return array;
        }
}
