package Unit;

public class Bandit extends Infantry{

    int disguise;
    public Bandit(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 15, 15, 7, 5, 3, 1);
        this.disguise = 15;
    }

    public void steal(Shooter Shooter){
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Bandit.super.name)
                .append("\t ATK: \t").append(Bandit.super.attack)
                .append("\t HP: \t").append(Bandit.super.hp);
    }
}
