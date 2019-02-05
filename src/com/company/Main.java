package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int avg;
        int sum=0;


        int inputs [] = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter 10 numbers");
            inputs[i] = sc.nextInt();

         sum+= inputs[i];
            System.out.println(sum);

                sum = sum + inputs[i];

            double average = sum / inputs.length;

            System.out.println("Average value of array elements is : " + average);


            String[] fruit = {"apple", "orange", "banana"};
            for(int index = 0; index < fruit.length; index++){
                System.out.println(fruit[index]);
            }
        }
    }












        }



