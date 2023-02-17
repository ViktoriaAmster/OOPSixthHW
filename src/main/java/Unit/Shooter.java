package Unit;

public abstract class Shooter extends Human{
    int cartridges;
    int range;

    public Shooter(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                   Integer protection, Integer speed, int cartridges, int range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed);
        this.cartridges = cartridges;
        this.range = range;
    }

    public int getCartridges() {
        return this.cartridges;
    }

}
