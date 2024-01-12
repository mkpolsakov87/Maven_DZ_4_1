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
        int popolnenie = 1075;


        int bonus;
        if (popolnenie > 1000) {
            bonus = popolnenie / 100;
        } else {
            bonus = 0;
        }

        int result = account + popolnenie + bonus;

        System.out.println("Итоговая сумма " + result);
    }
}