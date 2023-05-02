public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;//сумма кредита
        int term = 24;//срок кредита
        double percent = 9.99;//процентная ставка
        int payment = service.calculate(amount, term, percent);
        System.out.println("Ежемесячный платёж: " + payment);
    }
    }