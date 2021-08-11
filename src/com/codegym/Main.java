package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.print("Nhập màu sắc cho hình: " + "\n");
        String color = scanner.nextLine();
        System.out.println("Nhập độ dài 3 cạnh");
        System.out.println("Nhập cạnh thứ nhất: ");
        double side1 =  scanner.nextDouble();
        System.out.println("Nhập cạnh thứ hai: ");
        double side2 =  scanner.nextDouble();
        System.out.println("Nhập cạnh thứ ba: ");
        double side3 =  scanner.nextDouble();

        Triangle triangle1 = new Triangle(color, side1, side2, side3);
        System.out.println(triangle1);
    }
}
