package Unit;

public class Supernatural extends Human{

    protected int mana;
    protected int maxMana;


    public Supernatural(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public void healing (Integer damage, Human human){

    }

    }

