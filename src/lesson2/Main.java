package lesson2;

public class Main { public static void main(String[] args) {
    String[][] arr = {
            {"0 ", "0 ", "0 ", "0 "},
            {"1 ", "1 ", "1 ", "1 "},
            {"2 ", "2 ", "2 ", "2 "},
            {"3 ", "3", "3 ", "3 "}
    };


        try {
            int result = results (arr);
            System.out.println(result);

        }catch (MyArraySizeException e) {
            System.out.println("Размер массива неверный");}


       catch (MyArrayDataException e ){
        System.out.println("Значение массива неверно!");
        System.out.println("Ошибка находится в ячейке: "+"[" + e.i + "]" + " " + "[" + e.j + "]");
    }
}



    public static int results (String[][] arr) throws MyArraySizeException, MyArrayDataException {


        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();}


                for (int j = 0; j < arr[i].length; j++) {

                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }

            }
            return sum;
        }

    }


