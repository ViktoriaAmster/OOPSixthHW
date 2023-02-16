package Unit;

public class Spearman extends Infantry{
    public Spearman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Spearman(String name) { super(name, 20,20,10, 9,5,1); }
}
