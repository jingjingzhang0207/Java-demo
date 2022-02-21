package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.print("SHOPPING LIST\n");
//        System.out.print("\t- Milk\n");
//        System.out.print("\t\t> Semi-skimmed\n");
//        System.out.print("\t\t> Medium\n");
//        System.out.print("\t- Eggs\n");
//        System.out.print("\t\t> Free-range\n");
//        System.out.print("\t- Bread\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter you name~\n");
        String name = scanner.next();
        System.out.print("please enter you age~\n");
        int age = scanner.nextInt();
        System.out.format("You’ve lived %s years. In another %s years you’ll be %s years old\n",age,age,age*2);
        System.out.print(name.length());
    }
}
