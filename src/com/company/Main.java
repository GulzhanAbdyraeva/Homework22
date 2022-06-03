package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        Random random = new Random();
        System.out.print("50 numbers from random: ");
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
            System.out.print(numbers.get(i) + ", ");
            if(i==21){
                System.out.print(numbers.get(i)+"\n");
            }
        }
        for (int a : numbers) {
            if (a % 2 == 1) {
                odd.add(a);
            } else if (a % 2 == 0) {
                even.add(a);
            }
        }
        System.out.println("\nOdd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }

}


