public class CreditPaymentService {

    public int calculate(int amount, int term, double percent) {
        double percentMonth = percent / 12 / 100;//Процент в месяц
        double pay = amount * (( percentMonth * Math.pow((1 + percentMonth), term)) /
                (Math.pow((1 + percentMonth), term) - 1));//дифференцированный платёж
        return (int) pay;
    }
}


