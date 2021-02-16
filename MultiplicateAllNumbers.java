package com.learn.java;

public class MultiplicateAllNumbers {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[ArrayLength];
        int numberForArray;
        for(int i = 0; i < arrayLength; i++) {
            numberForArray = scanner.nextLine();
            numbers[i] = numberForArray;
        }
        int result;
        for(int j = 0; j < arrayLength; j++) {
            result = result * numbers[j];
        }
        System.out.println("Сума умножения всех чисел: " + result);
        int countOfDividers = 0;
        for(int k = 0; k < result; k++) {
            System.out.println(result / k);
        }
    }
}
