public class Main {
    public static void main(String[] args) {
        /*если клиент пополняет счет больше, че на 1000 рублей,*/
        /*то оператор дарит ему по 1 рублю за каждые полные 100 рублей*/

        int initialBalance = 700;
        int amountDeposit = 1200;
        int bonus;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет клиента:" + (initialBalance + amountDeposit + bonus) + "рублей");
    }
}
