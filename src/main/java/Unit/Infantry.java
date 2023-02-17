package Unit;

public abstract class Infantry extends Human{

    public Infantry(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                    Integer protection) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, 3);
    }


    @Override
    public Integer getAttack() {
        return attack;
    }
}
