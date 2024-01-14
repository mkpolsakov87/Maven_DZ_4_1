public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 83.5; // в кг
        double height = 1.76; // в метрах
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}