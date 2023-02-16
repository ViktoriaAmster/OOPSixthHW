package Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name) {
        super(name, 150, 150, 10, 10, 5, 3, 10, 5);
    }

    public Crossbowman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection,
                       Integer speed, int accuracy, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    @Override
    public Integer getAttack() { return attack; }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t ATK: \t").append(Crossbowman.super.attack)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges);
    }

}
