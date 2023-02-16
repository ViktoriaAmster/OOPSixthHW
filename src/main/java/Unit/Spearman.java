package Unit;

public class Spearman extends Infantry{
    public Spearman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Spearman(String name) { super(name, 20,20,10, 9,5,1); }

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t ATK: \t").append(Spearman.super.attack)
                .append("\t HP: \t").append(Spearman.super.hp);
    }

}
