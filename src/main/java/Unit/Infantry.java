package Unit;

public abstract class Infantry extends Human{

    public Infantry(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }
}
