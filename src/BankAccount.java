public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = getAmount() + sum;
        System.out.println("На ваш счёт положили: " + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > getAmount()) {
            throw new LimitException("Ошибка. Запрашиваемая сумма больше, чем сумма на счёте. " + "Вам будет выдана остаточная сумма:", (amount));
        }
        amount = getAmount() - sum;
        System.out.println("С вашего счёта снято: " + sum + ", остаточная сумма: " + amount);
    }
}
