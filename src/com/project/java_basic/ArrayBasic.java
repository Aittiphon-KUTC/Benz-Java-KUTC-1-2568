package com.project.java_basic;

public class ArrayBasic {
    public static void main(String[] args) {

//        String car [] = new String[4];
//        car[0] = "Benz" ;
//        car[1] = "Honda" ;
//        car[2] = "Mazda" ;
//        car[3] = "Esusi" ;

//        System.out.println(car[3]);

//        String cars[] = {"Benz", "Honda", "Mazda","Esusi"};
//        System.out.println(cars[3]);

//        int number[] = {10,20,30,40,50};
//
//        for (int i=0 ; i < number.length ; i++) {
//            System.out.println(number[i]);
//        }

        int number[] = {10,20,30,40,50};
        int sum = 0;
        for (int items:number) {
            System.out.println(items);
            sum = sum + items ;
        }
        System.out.println("Sum of this array : " + sum);

    }
}
