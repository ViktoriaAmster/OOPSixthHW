package Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name) {
        super(name, 150.1f, 150, 10, 10, 5, 3,
                5,7,6);
    }


    public Crossbowman(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                       Integer protection, Integer speed, int cartridges, int range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, cartridges, range);
    }

    @Override
    public Integer getAttack() { return attack; }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t ATK: \t").append(Crossbowman.super.attack)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges)
                .append("\t Speed: \t").append(Crossbowman.super.speed);
    }

}
