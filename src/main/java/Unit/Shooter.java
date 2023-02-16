package Unit;

public abstract class Shooter extends Human{
    int cartridges;
    int range;

    public Shooter(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection,
                   Integer speed, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.cartridges = cartridges;
        this.range = range;
    }
    public int getCartridges() {
        return this.cartridges;
    }

}
