import java.util.Scanner;

class Credit {
    static Scanner scanner = new Scanner(System.in);
    static int debit = 1000;
    static int term = 12;
    static boolean isDebitPaid = false;
    static int currentMonth = 1;
    static int payed = 0;

    static void pay(int sum) {
        while(true) {
            System.out.println((debit/term));
            if(sum == (debit/term)) {
                payed += sum;
                System.out.println("Ежемесячная оплата выполнена. Осталось оплатить: " + (debit - payed));
                break;
            }
            else if(sum >= (debit/term)) {
                payed += sum;
                System.out.println("Переплата. Осталось оплатить: " + (debit - payed));
                break;
            }
            else {
                payed += sum;
                System.out.println("Недоплата. Вам необходимо доплатить: " + ((debit/term) - sum));
                System.out.print("Введите сумму для погашения остатка: ");
                int surcharge = scanner.nextInt();
                sum += surcharge;
                continue;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Ваш долг: " + debit);
        System.out.println("Для погашения долга вам необходимо ежемесячно на протяжении " + term + " месяцев вносить " + (debit/term));
        while(!isDebitPaid) {
            if(payed == debit) {
                System.out.println("Кредит полностью погашен!");
                break;
            }
            else if(payed > debit) {
                System.out.println("Кредит полностью погашен! Ваша сдача: " + payed - debit);
                break;
            }
            System.out.println("Месяц " + currentMonth);
            System.out.print("Введите суму для погашения кредита: ");
            int payedSum = scanner.nextInt();
            pay(payedSum);
        }
    }
}
