package Unit;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(name, 150, 150, 10, 10, 5, 3, 10,
                5);
    }

    public Sniper(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed,
                  int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(Sniper.super.name)
                .append("\t ATK: \t").append(Sniper.super.attack)
                .append("\t HP: \t").append(Sniper.super.hp)
                .append("\t Arrows: ").append(Sniper.super.cartridges);
    }
}
