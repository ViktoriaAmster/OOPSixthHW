package Unit;

public class Witch extends Magic {


    public Witch(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                 Integer protection, int mana, int maxMana) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, mana, maxMana);
    }

    public Witch(String name) {
        super(name, 15.1f, 15, 10, 8, 7, 2, 15, 15);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public void step() {

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t ATK: \t").append(Witch.super.attack)
                .append("\t HP: \t").append(Witch.super.hp)
                .append("\t MP: \t").append(Witch.super.mana);
    }
}
