package com.company;
import java.lang.Integer;
public class Main {

    public static void main(String[] args) {
        /*double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        boolean d = Math.abs(a+b-c) < 1E-4;
        System.out.println(d);*/

        //double e = 0x0bp3;
       // System.out.println(0x0bp3);
        {
            int a = 100;

            // Преобразование целого числа в двоичный формат
            System.out.println(Integer.toBinaryString(a));

            // напечатать число 1 в числе a
            System.out.println(Integer.bitCount(a));
        }

    }

    // Java-программа для демонстрации работы
// метода java.lang.Integer.bitCount ()


   /* class Gfg {
        // код драйвера
        public static void main(String args[])


    } */
}