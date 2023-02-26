package Unit;

public abstract class Magic extends Human{

    protected int mana;
    protected int maxMana;
    protected int heal;

    public Magic(String name, float hp, int maxHp, int attack, int minDamage, int maxDamage, int protection, int speed,
                 int posX, int posY, int mana, int maxMana, int heal) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
        this.heal = heal;
    }

    public Float healing (Integer damage, Human human){ return hp;}

    }

