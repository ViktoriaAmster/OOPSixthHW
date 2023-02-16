package Unit;

public class Monk extends Magic {

    int FreezeStep;
    public Monk(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
        this.FreezeStep = FreezeStep;
    }

    public Monk(String name) {
        super(name,7,10,8,8,6,2,10,15);
        this.FreezeStep = 7;
    }

    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Monk.super.name)
                .append("\t ATK: \t").append(Monk.super.attack)
                .append("\t HP: \t").append(Monk.super.hp)
                .append("\t MP: \t").append(Monk.super.mana);

    }

}
