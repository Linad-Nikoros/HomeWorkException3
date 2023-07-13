package org.example;

public class PowerCalculator {
     public static void calculatePower(int num1, int num2) throws InvalidInputException {
          if (num1 == 0) throw new InvalidInputException("Основание не можеть быть равно нулю.");
          if (num2 < 0) throw new InvalidInputException("Степень не может быть отрицательной.");
          double result = Math.pow(num1, num2);
          System.out.println("Результат равен: " + result);
    }
}
