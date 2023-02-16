package Unit;

public class Bandit extends Infantry{

    String arms;
    public Bandit(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Bandit(String name) {
        super(name, 15, 15, 7, 5, 3, 1);
    }

    public String stealArms(Shooter Shooter){
        return arms;
    }
}
