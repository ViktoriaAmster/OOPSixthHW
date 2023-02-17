package Unit;

public class Monk extends Magic {

    int FreezeStep;

    public Monk(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                Integer protection, int mana, int maxMana, int freezeStep) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, mana, maxMana);
        FreezeStep = freezeStep;
    }

    public Monk(String name) {
        super(name,10.1f,10,8,8,6,2,10, 10);
        this.FreezeStep = 7;
    }

    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах: \t").append(Monk.super.name)
                .append("\t ATK: \t").append(Monk.super.attack)
                .append("\t HP: \t").append(Monk.super.hp)
                .append("\t MP: \t").append(Monk.super.mana);

    }

    @Override
    public void step() {

    }
}
