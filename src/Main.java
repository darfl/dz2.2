public class Main {
    public static void main(String[] args) {

        int amount = 1239;
        int accountBalance = 201;
        int bonus = amount / 100;
        int newBalance = accountBalance + amount + bonus;

        if (amount > 1000) {
            System.out.println("Ваш баланс: " + newBalance);
            System.out.println("Начислено бонусов: " + bonus);
        } else {
            System.out.println(amount + accountBalance);
        }
    }
}
