import java.util.Scanner;

public class BiggestNumberInArray {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int number;
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Введите любое целое число: ");
            number = scanner.nextInt();
            array[i] = number;
        }
        int BiggestNumber = 0;
        for(int j = 0; j < arrayLength; j++) {
            if(array[j] > BiggestNumber) {
                BiggestNumber = array[j];
            }
        }
        System.out.println(BiggestNumber);
    }
}
