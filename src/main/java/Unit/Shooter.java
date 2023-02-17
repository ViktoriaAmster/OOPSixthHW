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

    @Override
    public void step() {
        int cart = getCartridges();
        if (cart > 0) {
            setCartridges(cart-1);
        }
    }

    public int getCartridges() {
        return this.cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
