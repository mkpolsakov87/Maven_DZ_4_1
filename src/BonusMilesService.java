public class BonusMilesService {

    public int calculate(int price) {

        int mile = 20;
        int bonus = price / mile;
        return bonus;
    }
}
