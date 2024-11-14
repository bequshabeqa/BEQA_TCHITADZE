package Task_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ჩაწერე პირველი integer: ");
        int num1 = scanner.nextInt();

        System.out.print("ჩაწერე მეორე integer: ");
        int num2 = scanner.nextInt();

        System.out.print("ჩაწერე მოქმედება (+, -, *, /): ");
        String moqmedeba = String.valueOf(scanner.next().charAt(0));

        try{
            if (moqmedeba.equals("+")) {
                System.out.println("შედეგი: " + (num1 + num2));
            } else if (moqmedeba.equals("-")) {
                System.out.println("შედეგი: " + (num1 - num2));
            } else if (moqmedeba.equals("*")) {
                System.out.println("შედეგი: " + (num1 * num2));
            } else if (moqmedeba.equals("/")) {
                System.out.println("შედეგი: " + num1 / num2);
            }
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
