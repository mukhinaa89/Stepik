package com.company;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        boolean d = Math.abs(a+b-c) < 1E-4;
        System.out.println(d);
        };
    }
