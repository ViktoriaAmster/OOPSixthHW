package Unit;

public abstract class Infantry extends Human{

    public Infantry(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int protection,
                    int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }

}
