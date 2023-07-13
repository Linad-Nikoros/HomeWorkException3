package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите основание: ");
            int num1 = sc.nextInt();
            System.out.println("Введите степень: ");
            int num2 = sc.nextInt();
            PowerCalculator.calculatePower(num1, num2);
        } catch (InvalidInputException e ) {
            System.out.println("Ошибка! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введеный символ не является целым числом.");
        }
    }
}