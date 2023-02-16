package Unit;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(name, 150, 150, 10, 10, 5, 3, 5,
                10,10);
    }

    public Sniper(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed,
                  int accuracy, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, accuracy, cartridges, range);
    }
}
