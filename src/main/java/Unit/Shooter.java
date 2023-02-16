package Unit;

public class Shooter extends Human{
    int accuracy;
    int cartridges;
    int range;

    public Shooter(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int accuracy, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.accuracy = accuracy;
        this.cartridges = cartridges;
        this.range = range;
    }




    public int getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getCartridges() {
        return this.cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }


}
