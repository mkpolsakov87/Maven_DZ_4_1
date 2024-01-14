public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000; // в рублях
        double rate = 9.99; // в процентах
        int period = 12; // в месяцах

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 12));

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 24));

        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 36));
    }
}