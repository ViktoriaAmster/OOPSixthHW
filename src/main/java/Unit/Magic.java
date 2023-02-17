package Unit;

public abstract class Magic extends Human{

    protected int mana;
    protected int maxMana;

    public Magic(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                 Integer protection, int mana, int maxMana) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, 2);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public Float healing (Integer damage, Human human){ return hp;}

    }

