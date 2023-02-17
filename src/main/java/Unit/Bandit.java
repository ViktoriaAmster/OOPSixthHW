package Unit;

public class Bandit extends Infantry{

    int disguise;

    public Bandit(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, int disguise) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 15.1f, 15, 7, 5, 3, 6);
        this.disguise = 15;
    }

    public void steal(Shooter Shooter){
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Bandit.super.name)
                .append("\t ATK: \t").append(Bandit.super.attack)
                .append("\t HP: \t").append(Bandit.super.hp)
                .append("\t Speed: \t").append(Bandit.super.speed);
    }

    @Override
    public void step() {

    }
}
