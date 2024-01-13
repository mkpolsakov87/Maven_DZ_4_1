public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int account = 100;
        int replenish = 1075;


        int bonus;
        if (replenish > 1000) {
            bonus = replenish / 100;
        } else {
            bonus = 0;
        }

        int result = account + replenish + bonus;

        System.out.println("Бонусные рубли " + bonus);
        System.out.println("Итоговая сумма " + result);
    }
}