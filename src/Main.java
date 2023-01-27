import java.sql.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        myMethod();
        programma1(new int[]{1, 8, 3, 3, 4, 4, 9, 12});
        programis2(new int[]{1, 8, 3, 3, 4, 4, 9, 12});
//        Salam1("Rinat");
//        parametr(9, 9);
    }

    //DOMASHKA
    static void programma1(int[] array1) {
        System.out.print("Massiv : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println("\n Minimalnyi element : " + min);

    }

    //    DOMASHKA
    static void programis2(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
        }
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println("\n Maksimalnyi element : " + max);

        double avarage = 0;
        for (int i = 0; i < array1.length; i++) {
            avarage += array1[i] / array1.length;
        }
        System.out.println("ortocho san : " + avarage);


//    private static void programma1() {
//    }
//
//    private static void array1() {
//    }

//    static void method(int num) {
//        if (num % 2 == 0) {
//            System.out.println(num+"jup");
//        }else {
//            System.out.println(num+"tak san");
//        }
//
//        static void method(int a , int b) {
//            System.out.println((Math.min(a,b)));
//
//    static void array(String[] animals) {
//
//        System.out.println(animals[2]);

//    static void myMethod() {
//        for (int i = 1; i < 11; i++) {
//
//            for (int j = 1; j < 11; j++) {
//                System.out.println(i * j);
//            }
//            System.out.println();


    }

//    static void Salam1(String name) {
//        System.out.println("Salam " + name);
//    }


//    static void parametr(int a, int b) {
//        System.out.println("(a+b)/2=" + (a + b) / 2);
//    }
}












