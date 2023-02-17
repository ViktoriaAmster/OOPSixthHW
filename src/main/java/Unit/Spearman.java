package Unit;

public class Spearman extends Infantry{
    public Spearman(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection);
    }

    public Spearman(String name) { super(name, 20.1f,20,10, 9,5, 7); }

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t ATK: \t").append(Spearman.super.attack)
                .append("\t HP: \t").append(Spearman.super.hp)
                .append("\t Speed: \t").append(Spearman.super.speed);
    }

}
