package Unit;

public class Witch extends Magic {


    public Witch(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                 Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
    }

    public Witch(String name) { super(name, 15,15,10,8,7,2,15,20); }

    @Override
    public Integer getAttack() {
        return attack;
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
