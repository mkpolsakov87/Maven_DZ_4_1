public class CreditPaymentService {

    public int calculate(int credit, double rate, int period) {

        double fraction = (rate / 12) / 100;
        double coefficient = (fraction * (Math.pow(1 + fraction, period))) / (Math.pow(1 + fraction, period) - 1);
        double payment = credit * coefficient;

        return (int) payment;
    }
}
