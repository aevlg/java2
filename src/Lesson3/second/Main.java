package Lesson3.second;



public class Main {


    public static void main(String[] args){


        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес ORANGE BOX1: " + orange1Weigth);
        System.out.println("Вес ORANGE BOX2: " + orange2Weigth);
        System.out.println("Вес APPLE BOX: " + appleWeigth);

        System.out.println("СРАВНИТЬ ВЕС ORANGE BOX1  и APPLE BOX: " + orangeBox1.compare(appleBox));
        System.out.println("СРАВНИТЬ ВЕС  ORANGE BOX2 и APPLE BOX: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}

