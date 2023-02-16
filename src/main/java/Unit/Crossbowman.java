package Unit;

public class Crossbowman  extends Shooter{

    public Crossbowman(String name) {
        super(name, 150, 150, 10, 10, 5, 3, 7, 10, 5);
    }

    public Crossbowman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection,
                       Integer speed, int accuracy, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, accuracy, cartridges, range);
    }
}
